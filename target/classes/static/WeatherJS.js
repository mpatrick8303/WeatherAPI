$(document).ready(function()//This is started on the load of the page
{
				
	$('#getWeth').click(function()
	{
		console.log(document.getElementById("zipcode").value)
		$.getJSON("weather/" + document.getElementById("zipcode").value,display)
	});

	function display(response)
	{
		var jsonW = $.parseJSON(response[0]);
		var jsonF = $.parseJSON(response[1]);
		console.log(jsonF)
		
		location(jsonW);
		weather(jsonW);
		
		
	}
	
	function location(jsonW)
	{
		
		var city = jsonW.current_observation.display_location.city;
		var state = jsonW.current_observation.display_location.state_name;
		var zip = jsonW.current_observation.display_location.zip;
		
		$('#locationD').empty();
		$('#location').removeClass("hidden");
		$('#locationD').append('<div id:city> City: ' + city + '</div><br>');
		$('#locationD').append('<div id:state> State: ' + state + '</div><br>');
		$('#locationD').append('<div id:zip> Zipcode: ' + zip + '</div>');
	}
	function weather(jsonW)
	{
		var tempf = jsonW.current_observation.temp_f;
		var tempc = jsonW.current_observation.temp_c;
		var relHumid = jsonW.current_observation.wind_mph;
		
		$('#weatherSimpD').empty();
		$('#weatherSimp').removeClass("hidden");
		$('#weatherSimpD').append('<div id:temp_f> Temp(F): ' + tempf + '</div><br>');
		$('#weatherSimpD').append('<div id:temp_c> Temp(C): ' + tempc + '</div><br>');
		$('#weatherSimpD').append('<div id:wind> Wind(MPH): ' + relHumid + '</div>');
		
		var feelLikef = jsonW.current_observation.feelslike_f;
		var feelLikec = jsonW.current_observation.feelslike_c;
		var UV = jsonW.current_observation.UV;
		
		$('#weatherSimp2D').empty();
		$('#weatherSimp2').removeClass("hidden");
		$('#weatherSimp2D').append('<div id:feelLikef> Feels Like(F): ' + feelLikef+ '</div><br>')
		$('#weatherSimp2D').append('<div id:feelLikec> Feels Like(C): ' + feelLikec+ '</div><br>')
		
		var iconURL = jsonW.current_observation.icon_url;
		//var iconURL = '"' + iconURL + '"';
		console.log(iconURL);
		
		$('#picture').empty();
		$('#picture').append('<img id=pic src=' + iconURL + '></img>')
	}
	
	function forecast(response)
	{
		
	}
	
	
});

