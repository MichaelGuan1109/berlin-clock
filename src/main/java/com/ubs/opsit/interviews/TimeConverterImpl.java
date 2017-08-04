package com.ubs.opsit.interviews;



public class TimeConverterImpl implements TimeConverter{
	
	public String convertTime(String aTime) {
		if (aTime == null) {
			throw new RuntimeException("time string cannot be empty");
		}
		String[] timeArray = aTime.split(":");
		if (timeArray.length != 3) {
			throw new RuntimeException("time string format is wrong");
		}
	
		StringBuilder sb = new StringBuilder();
		sb.append(getSecond(Integer.parseInt(timeArray[2])));
		sb.append("\n");
		sb.append(getFiveHours(Integer.parseInt(timeArray[0])));
		sb.append("\n");
		sb.append(getHours(Integer.parseInt(timeArray[0])));
		sb.append("\n");
		sb.append(getFiveMinutes(Integer.parseInt(timeArray[1])));
		sb.append("\n");
		sb.append(getMinutes(Integer.parseInt(timeArray[1])));
		return sb.toString();
	}
	
	private String getSecond(int seconds) {
		if (seconds > 59 || seconds < 0) {
			throw new RuntimeException("seconds time string format is wrong");
		}
		return seconds % 2 == 1 ? "O" : "Y";
		
	}
	
	private String getFiveHours(int hours) {
		if (hours > 24 || hours < 0) {
			throw new RuntimeException("hours time string format is wrong");
		}
		int numberOfFiveHour = Math.floorDiv(hours, 5);
		String fiveHourString = "OOOO";
		switch (numberOfFiveHour) {
			case 0:
				fiveHourString = "OOOO";
				break;
			case 1:
				fiveHourString = "ROOO";
				break;
			case 2:
				fiveHourString = "RROO";
				break;
			case 3:
				fiveHourString = "RRRO";
				break;
			case 4:
				fiveHourString = "RRRR";
				break;
			default:
				break;
				
		}
		return fiveHourString;
		
	}
	
	private String getHours(int hours) {
		if (hours > 24 || hours < 0) {
			throw new RuntimeException("hours time string format is wrong");
		}
		int numberOfHour = hours % 5;
		String hourString = "";
		switch (numberOfHour) {
			case 0:
				hourString = "OOOO";
				break;
			case 1:
				hourString = "ROOO";
				break;
			case 2:
				hourString = "RROO";
				break;
			case 3:
				hourString = "RRRO";
				break;
			case 4:
				hourString = "RRRR";
				break;
			default:
				break;
				
		}
		return hourString;
		
	}
	
	private String getMinutes(int minutes) {
		if (minutes > 59 || minutes < 0) {
			throw new RuntimeException("minutes time string format is wrong");
		}
		int numberOfMinutes = minutes % 5;
		String minutesString = "";
		switch (numberOfMinutes) {
			case 0:
				minutesString = "OOOO";
				break;
			case 1:
				minutesString = "YOOO";
				break;
			case 2:
				minutesString = "YYOO";
				break;
			case 3:
				minutesString = "YYYO";
				break;
			case 4:
				minutesString = "YYYY";
				break;
			default:
				break;
				
		}
		return minutesString;
		
	}
	
	private String getFiveMinutes(int minutes) {
		if (minutes > 59 || minutes < 0) {
			throw new RuntimeException("minutes time string format is wrong");
		}
		int numberOfFiveMinutes = Math.floorDiv(minutes, 5);
		String fiveMinutesString = "";
		switch (numberOfFiveMinutes) {
			case 0:
				fiveMinutesString = "OOOOOOOOOOO";
				break;
			case 1:
				fiveMinutesString = "YOOOOOOOOOO";
				break;
			case 2:
				fiveMinutesString = "YYOOOOOOOOO";
				break;
			case 3:
				fiveMinutesString = "YYROOOOOOOO";
				break;
			case 4:
				fiveMinutesString = "YYRYOOOOOOO";
				break;
			case 5:
				fiveMinutesString = "YYRYYOOOOOO";
				break;
			case 6:
				fiveMinutesString = "YYRYYROOOOO";
				break;
			case 7:
				fiveMinutesString = "YYRYYRYOOOO";
				break;
			case 8:
				fiveMinutesString = "YYRYYRYYOOO";
				break;
			case 9:
				fiveMinutesString = "YYRYYRYYROO";
				break;
			case 10:
				fiveMinutesString = "YYRYYRYYRYO";
				break;
			case 11:
				fiveMinutesString = "YYRYYRYYRYY";
				break;
			default:
				break;	
		}
		return fiveMinutesString;
		
	}

}
