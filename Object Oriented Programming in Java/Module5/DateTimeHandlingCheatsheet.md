# Coding Cheat Sheet

<!-- Reviewer: IMPORTANT! This file is a reading using the instructional lab environment so the learner can have a table of contents to locate code snippets based on the corresponding video. This reading does not include an estimated time. In this first paragraph, please update the first sentence to reflect the description of the course and not necessarily the exact course name (for content reuse across platforms.) -->

This reading provides a reference list of code that you\'ll encounter as you work with object-oriented coding in Java. Understanding these concepts will help you write and debug your first Java programs. Let\'s explore the following Java coding concepts:

- Using Java Date and Time Classes
- Formatting Dates in Java
- Using Timezones in Java
- Parsing Dates from Strings in Java

Keep this summary reading available as a reference as you progress through your course, and refer to this reading as you begin coding with Java after this course!


## Using the LocalDate class

| Description | Example |
|--------|--------|
| Import the `LocalDate` class, which is part of the Java Date and Time API. | <pre>import java.time.LocalDate;</pre> |
| Define a public class `LocalDateExample` that contains the Java `main` method. Use `LocalDate.now()` to retrieve the current date and print it in the \"YYYY-MM-DD\" format, which is the default format of `LocalDate.toString()`. | <pre>public class LocalDateExample {<br>    public static void main(String[] args) {<br>        LocalDate today = LocalDate.now();<br>        System.out.println("Today's date: " + today);<br></pre> |
| Close curly braces to end the `LocalDateExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the use of the `LocalDate` class from the `java.time` package to get and display the current date.

## Using the LocalTime class

| Description | Example |
|--------|--------|
| Import the `LocalTime` class, which is part of the Java Date and Time API. | <pre>import java.time.LocalTime;</pre> |
| Define a public class `LocalTimeExample` that contains the Java `main` method. Use `LocalTime.now()` to retrieve the current system time and print it in the \"HH&#58;mm&#58;ss.SSS\" (hours, minutes, seconds, and milliseconds/nanoseconds) format, which is the default format of `LocalTime.toString()`. | <pre>public class LocalTimeExample {<br>    public static void main(String[] args) {<br>        LocalTime currentTime = LocalTime.now();<br>        System.out.println("Current time: " + currentTime);<br></pre> |
| Close curly braces to end the `LocalTimeExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the use of the `LocalTime` class from the `java.time` package to get and display the current time.

## Using the LocalDateTime class

| Description | Example |
|--------|--------|
| Import the `LocalDateTime` class, which is part of the Java Date and Time API. | <pre>import java.time.LocalDateTime;</pre> |
| Define a public class `LocalDateTimeExample` that contains the Java `main` method. Use `LocalDateTime.now()` to retrieve the current system date and time. Print the current date and time in the default format \"YYYY-MM-DDTHH&#58;MM&#58;SS.SSS\" (year, month, day, hours, minutes, seconds, and milliseconds/nanoseconds), which is the default format of `LocalDateTime.toString()`. | <pre>public class LocalDateTimeExample {<br>    public static void main(String[] args) {<br>        LocalDateTime now = LocalDateTime.now();<br>        System.out.println("Current date and time: " + now);<br></pre> |
| Close curly braces to end the `LocalDateTimeExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates the use of the `LocalDateTime` class from the `java.time` package to get and display the current date and time. `LocalDateTime` is an immutable class that represents both date and time without a time zone.

## Using the ZonedDateTime class

| Description | Example |
|--------|--------|
| Import the `ZonedDateTime` class, which is part of the Java Date and Time API. | <pre>import java.time.ZonedDateTime;</pre> |
| Define a public class `ZonedDateTimeExample` that contains the Java `main` method. Use `ZonedDateTime.now()` to retrieve the current system date and time, including the time zone. Print the current date, time, and zone in the default ISO-8601 format. | <pre>public class ZonedDateTimeExample {<br>    public static void main(String[] args) {<br>        ZonedDateTime zonedNow = ZonedDateTime.now();<br>        System.out.println("Current date and time with zone: " + zonedNow);<br></pre> |
| Close curly braces to end the `ZonedDateTimeExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to use the `ZonedDateTime` class from the `java.time` package to retrieve and display the current date and time along with the time zone. It is useful when working with time zones in applications such as scheduling, logging, and internationalization.

## Real World example of an Event Management System

| Description | Example |
|--------|--------|
| Import the `LocalDate`, `LocalTime`, `LocalDateTime`, `ZoneId`, `ZonedDateTime`, and `Scanner` classes that are part of the Java Date and Time API. | <pre>import java.time.LocalDate;<br>import java.time.LocalDateTime;<br>import java.time.LocalTime;<br>import java.time.ZoneId;<br>import java.time.ZonedDateTime;<br>import java.util.Scanner;<br></pre> |
| Define an `EventManagement` class to represent an event with `name`, `date`, `time`, and `timeZone`. The method `getEventDateTime()` converts `LocalDate` and `LocalTime` into `LocalDateTime`. Then converts `LocalDateTime` into `ZonedDateTime` using the specified time zone. | <pre>public class EventManagement {<br><br>    static class Event {<br>        String name;<br>        LocalDate date;<br>        LocalTime time;<br>        ZoneId timeZone;<br><br>        public Event(String name, LocalDate date, LocalTime time, ZoneId timeZone) {<br>            this.name = name;<br>            this.date = date;<br>            this.time = time;<br>            this.timeZone = timeZone;<br>        }<br>        public ZonedDateTime getEventDateTime() {<br>            LocalDateTime localDateTime = LocalDateTime.of(date, time);<br>            return ZonedDateTime.of(localDateTime, timeZone);<br>        }<br>    }
</pre>
| Define a public class with the Java `main` method and use it to accept user input for event details. This class captures `name`, `date`, `time`, and `timeZone` from user input. The method `Event(name, date, time, timeZone)` creates an event object via user input. The method `getEventDateTime()` displays the event date an time in the specified time zone. The method `ZonedDateTime` converts `eventDateTime` to the system\'s local time zone. The method `scanner.close()` closes the scanner to free up resources. | <pre>    public static void main(String[] args) {<br>        Scanner scanner = new Scanner(System.in);<br><br>        // Input event details<br>        System.out.println("Enter event name:");<br>        String name = scanner.nextLine();<br><br>        System.out.println("Enter event date (YYYY-MM-DD):");<br>        String dateInput = scanner.nextLine();<br>        LocalDate date = LocalDate.parse(dateInput);<br><br>        System.out.println("Enter event time (HH:MM):");<br>        String timeInput = scanner.nextLine();<br>        LocalTime time = LocalTime.parse(timeInput);<br><br>        System.out.println("Enter time zone (e.g., America/New_York):");<br>        String zoneInput = scanner.nextLine();<br>        ZoneId timeZone = ZoneId.of(zoneInput);<br><br>        // Create the event<br>        Event event = new Event(name, date, time, timeZone);<br><br>        // Display event details<br>        System.out.println("Event created: " + event.name);<br>        ZonedDateTime eventDateTime = event.getEventDateTime();<br>        System.out.println("Event Date and Time: " + eventDateTime);<br><br>                // Display in system's default time zone<br>        ZonedDateTime defaultZonedDateTime = eventDateTime.withZoneSameInstant(ZoneId.systemDefault());<br>        System.out.println("Event Date and Time in your local time zone: " + defaultZonedDateTime);<br><br>        scanner.close();<br></pre> |
| Close curly braces to end the `EventManagement` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program is a simple event management system that allows users to enter an event\'s details, including its name, date, time, and time zone. It then converts and displays the event time in both the specified time zone and the system\'s default time zone.


::page{title="Formatting Dates in Java"}

## Formatting a date using LocalDate

| Description | Example |
|--------|--------|
| Import the `LocalDate` class to represent a date (year, month, day) without time or a time zone and `DateTimeFormatter` class to define a custom format for displaying dates. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;</pre> |
| Define a public class `DateFormattingExample` that contains the Java `main` method. Use `LocalDate.now()` to retrieve the current date in the \"YYYY-MM-DD\" format, which is the default format of `LocalDate()`. Define a date format using `DateTimeFormatter.ofPattern("dd/MM/yyyy")`. Format the date using `currentDate.format(formatter)` to convert the current date into the specified format and print the formatted date to the console. | <pre>public class DateFormattingExample {<br>    public static void main(String[] args) {<br>        // Get the current date<br>        LocalDate currentDate = LocalDate.now();<br><br>        // Define the format<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");<br><br>        // Format the date<br>        String formattedDate = currentDate.format(formatter);<br><br>        // Print the formatted date<br>        System.out.println("Formatted Date: " + formattedDate);<br></pre> |
| Close curly braces to end the `DateFormattingExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to format a date using DateTimeFormatter from the java.time package. It formats dates into a human-friendly format.

## Real World example of formatting birthdates in a User Registration System

| Description | Example |
|--------|--------|
| Import the `LocalDate` class to represent a date (year, month, day) without time or a time zone, the `DateTimeFormatter` class to define a custom format for displaying dates, and the `Scanner` class to get user input. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;<br>import java.util.Scanner;</pre> |
| Define a public class `UserRegistration` that contains the Java `main` method. Create a `Scanner` object to read user input. Get the user name and store it in the `name` variable. Get the user birthdate in the \"YYYY-MM-DD\" format. The input string `birthdateInput` is converted into a `LocalDate` object using `LocalDate.parse()`. Format the birthdate using the \"EEEE, MMM dd, yyyy\" pattern, where EEE is the full weekday name, such as \"Monday\"; MMM is the abbreviated month name, such as Mar, dd is the two-digit day, such as 11, and \"yyyy\" is the four-digit year, such as 2025. Use the 	`birthdate.format(formartter)` method to convert the date into a readable format. Print a personalized message with the formatted birthdate and close the scanner. | <pre>public class UserRegistration {<br>    public static void main(String[] args) {<br>        Scanner scanner = new Scanner(System.in);<br><br>        // Get user\'s name<br>        System.out.print("Enter your name: ");<br>        String name = scanner.nextLine();<br><br>        // Get user's birthdate<br>        System.out.print("Enter your birthdate (yyyy-MM-dd): ");<br>        String birthdateInput = scanner.nextLine();<br><br>        // Parse the input string into a LocalDate object<br>        LocalDate birthdate = LocalDate.parse(birthdateInput);<br><br>        // Define the desired output format<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");<br><br>        // Format the birthdate using the defined formatter<br>        String formattedBirthdate = birthdate.format(formatter);<br><br>        // Display the result<br>        System.out.println("Hello " + name + "! Your birthdate is: " + formattedBirthdate);<br><br>        // Close the scanner<br>        scanner.close();<br></pre> |
| Close curly braces to end the `UserRegistration` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program prompts the user to enter their name and birthdate, then formats and displays the birthdate in a more readable format.


::page{title="Using Timezones in Java"}

## Creating a ZoneId

| Description | Example |
|--------|--------|
| Import `ZoneId` which is part of the Java Date and Time API class to represent a time zone, such as \"America/New_York\", \"Asia/Tokyo\", and \"Europe/London\". | <pre>import java.time.ZoneId;</pre> |
| Define a public class `TimeZoneExample` that contains the Java `main` method. Use `ZoneId.of("America/New_York")` to create a `ZoneId` object for New York and display the Time Zone ID to the console. | <pre>public class TimeZoneExample {<br>    public static void main(String[] args) {<br>        // Creating a ZoneId for New York<br>        ZoneId newYorkZone = ZoneId.of("America/New_York");<br>        System.out.println("Time Zone ID: " + newYorkZone);<br>
</pre> |
| Close curly braces to end the `TimeZoneExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to create and display a time zone ID using the `java.time` package.

## Creating a ZoneDateTime

| Description | Example |
|--------|--------|
| Import the `ZonedDateTime` and `ZoneId` classes which are part of the Java Date and Time API class to represent a date-time with a time zone. | <pre>import java.time.ZonedDateTime;<br>import java.time.ZoneId;</pre> |
| Create a time zone object for New York by calling `ZoneId.of("America/New_York")` and retrieve the current date and time in that time zone. Display the current date and time in New York. | <pre>public class ZonedDateTimeExample {<br>    public static void main(String[] args) {<br>        // Getting the current date and time in New York<br>        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));<br>        System.out.println("Current Date and Time in New York: " + newYorkTime);<br></pre> |
| Close curly braces to end the `ZoneDateTimeExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to create and display a time zone ID using the `java.time` package.

## Real World example of Scheduling Meeting across Time Zones

| Description | Example |
|--------|--------|
| Import the `ZonedDateTime`, `ZoneId`, and `DateTimeFormatter` classes which are part of the Java Date and Time API class to represent a date-time with a time zone and format the date-time in a custom pattern. | <pre>import java.time.ZonedDateTime;<br>import java.time.ZoneId;<br>import java.time.format.DateTimeFormatter;</pre> |
| Define the meeting time in UTC. `ZonedDateTime.parse("2024-12-30T15:00:00Z")` parses the fixed UTC time (2024-12-30 15:00:00 UTC) into a `ZonedDateTime` object. Create an array of time zones for participants in New York, London, Kolkata, and Sydney. These time zones are later used to convert the UTC time to each participant\'s local time. Create a custom formatter for displaying the date and time in the pattern: `DateTimeFormatter.ofPattern("yyyy-MM-dd HH꞉mm꞉ss z")`. Print the meeting time in UTC using the defined format. For each time zone, use `meetingTimeUTC.withZoneSameInstant(ZoneId.of(timeZone))` to convert the meeting time from UTC to the local time of that participant\'s time zone and print the meeting time in the participant\'s local time zone using the custom formatter. | <pre>public class ConferenceScheduler {<br>    public static void main(String[] args) {<br>        // Define the meeting time in UTC<br>        ZonedDateTime meetingTimeUTC = ZonedDateTime.parse("2024-12-30T15:00:00Z");<br><br>        // Define participant time zones<br>        String[] participantTimeZones = {<br>            "America/New_York", // Eastern Standard Time (EST)<br>            "Europe/London",    // Greenwich Mean Time (GMT)<br>            "Asia/Kolkata",     // Indian Standard Time (IST)<br>            "Australia/Sydney"  // Australian Eastern Daylight Time (AEDT)<br>        };<br><br>        // Format for displaying the date and time<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH&#58;mm&#58;ss z");<br><br>        // Print the meeting time in each participant's local time zone<br>        System.out.println("Meeting Time in UTC: " + meetingTimeUTC.format(formatter));<br>        for (String timeZone : participantTimeZones) {<br>            ZonedDateTime localTime = meetingTimeUTC.withZoneSameInstant(ZoneId.of(timeZone));<br>            System.out.println("Meeting Time in " + timeZone + ": " + localTime.format(formatter));<br>        }<br></pre> |
| Close curly braces to end the `ConferenceScheduler` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program simulates scheduling a meeting across different time zones. It converts a fixed UTC meeting time to the local times of participants in various time zones and displays it in a formatted way.


::page{title="Parsing Dates from Strings in Java"}

## Parsing dates with DateTimeFormatter

| Description | Example |
|--------|--------|
| Import the `LocalDate` and `DateTimeFormatter` classes, which are part of the Java Date and Time API class and used to represent dates without a time zone and define a pattern for parsing and formatting dates. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;</pre> |
| Create a public class `DateParsingExample` that contains the Java `main` method and define a string variable `dateString` to represent date in the format \"yyyy-MM-dd\". Create a date formatter using the `DateTimeFormatter.ofPattern("yyyy-MM-dd")` method. Use `LocalDate.parse(dateString, formatter)` to convert the `dateString` into a `LocalDate` object and print the parsed date. | <pre>public class DateParsingExample {<br>    public static void main(String[] args) {<br>        // Define a date string to parse<br>        String dateString = "2025-01-23";<br><br>        // Create a DateTimeFormatter to define the expected format<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");<br><br>        // Parse the string into a LocalDate object<br>        LocalDate date = LocalDate.parse(dateString, formatter);<br><br>        // Output the parsed date<br>        System.out.println("Parsed date: " + date);<br></pre> |
| Close curly braces to end the `DateParsingExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to parse a date string into a `LocalDate` object using the `DateTimeFormatter` class.

## Using custom date formats

| Description | Example |
|--------|--------|
| Import the `LocalDate` and `DateTimeFormatter` classes, which are part of the Java Date and Time API class and used to represent dates without a time zone and define a pattern for parsing and formatting dates. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;</pre> |
| Create a public class `CustomDateParsing` that contains the Java `main` method and define a string variable `dateString` to represent date in the format \"dd/MM/yyyy\". Create a date formatter using the `DateTimeFormatter.ofPattern("dd/MM/yyyy")` method. Use `LocalDate.parse(dateString, formatter)` to convert the `dateString` into a `LocalDate` object and print the parsed date. | <pre>public class CustomDateParsing {<br>    public static void main(String[] args) {<br>        String dateString = "23/01/2025";<br><br>        // Define the pattern for parsing<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");<br><br>        LocalDate date = LocalDate.parse(dateString, formatter);<br><br>        System.out.println("Parsed date: " + date);<br></pre> |
| Close curly braces to end the `CustomDateParsing` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to parse a date string with a custom format into a `LocalDate` object using the `DateTimeFormatter` class.

## Parsing LocalDateTime

| Description | Example |
|--------|--------|
| Import the `LocalDateTime` and `DateTimeFormatter` classes, which are part of the Java Date and Time API class and used to represent dates without a time zone and define a pattern for parsing and formatting dates. | <pre>import java.time.LocalDateTime;<br>import java.time.format.DateTimeFormatter;</pre> |
| Create a public class `DateTimeParsingExample` that contains the Java `main` method and define a string variable `dateString` to represent date in the \"yyyy-MM-dd\" format. Create a date formatter using the `DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")` method. Use `LocalDateTime.parse(dateTimeString, formatter)` to convert the `dateTimeString` into a `LocalDateTime` object using the formatter and print the parsed date. | <pre>public class DateTimeParsingExample {<br>    public static void main(String[] args) {<br>        String dateTimeString = "2025-01-23 15:30";<br><br>        // Define the pattern for date and time<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");<br><br>        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);<br><br>        System.out.println("Parsed date and time: " + dateTime);<br></pre> |
| Close curly braces to end the `DateTimeParsingExample` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program demonstrates how to parse a date string with a custom format into a `LocalDateTime` object using the `DateTimeFormatter` class.

## Example of extracting date from a simple sentence

| Description | Example |
|--------|--------|
| Import the `LocalDate`, `DateTimeFormatter`, and `DateTimeParseException` classes, which are part of the Java Date and Time API class and used to represent dates without a time zone, define a pattern for parsing and formatting dates, and handle errors if the date format is incorrect. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;<br>import java.time.format.DateTimeParseException;</pre> |
| Create a public class `ExtractDateFromSentence` that contains the Java `main` method and define a sentence containing a date formatted as \"yyyy-MM-dd\". Extract the date substring using `sentence.substring(sentence.indexOf("on") + 3, sentence.indexOf("."))`. The `sentence.indexOf("on") + 3` method finds the position of \"on\" and moves three characters forward to skip \"on \" (with the space), `sentence.indexOf(".")` identifies the position of the period (\".\") at the end of the date, and `substring(...)` extracts the portion of the string that contains the date. Parse the extracted date using `LocalDate.parse(dateString, formatter)` and convert the extracted string into a `LocalDate` object. The `try-catch` block prints the extracted date if successful. If parsing fails due to an incorrect format, the block catches `DateTimeParseException` and displays an error message. | <pre>public class ExtractDateFromSentence {<br>    public static void main(String[] args) {<br>        String sentence = "The event will take place on 2025-01-23.";<br><br>        // Define the date pattern<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");<br><br>        // Extract the date part from the string<br>        String dateString = sentence.substring(sentence.indexOf("on") + 3, sentence.indexOf("."));<br><br>        try {<br>            LocalDate date = LocalDate.parse(dateString, formatter);<br>            System.out.println("Extracted date: " + date);<br>        } catch (DateTimeParseException e) {<br>            System.out.println("Error parsing date: " + e.getMessage());<br>        }<br></pre> |
| Close curly braces to end the `ExtractDateFromSentence` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program extracts a date from a given sentence, parses it into a `LocalDate` object, and displays it in a structured format. It also gracefully handles potential parsing errors.

## Example of extracting multiple dates from a text string

| Description | Example |
|--------|--------|
| Import the `LocalDate`, `DateTimeFormatter`, and `DateTimeParseException` classes, which are part of the Java Date and Time API class and used to represent dates without a time zone, define a pattern for parsing and formatting dates, and handle errors if the date format is incorrect. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;<br>import java.time.format.DateTimeParseException;</pre> |
| Create a public class `ExtractMultipleDates` that contains the Java `main` method and define a `text` string containing three dates in the \"yyyy-MM-dd\" format. These dates are separated by commas and the word \"and\". Define the date format using `DateTimeFormatter.ofPattern("yyyy-MM-dd")`. Use regular expressions `(", \| and ")` to split the string by comma followed by a space (\", \") and the word \"and\" followed by a space (\"and \"). This extracts the date strings from the text. Iterate over the extracted parts and parse dates. For each extracted part, `trim()` removes any leading or trailing spaces and `LocalDate.parse(part.trim(), formatter)` converts the string into a `LocalDate` object. If parsing is successful, it prints the extracted date. If parsing fails, the catch block handles the error and prints an error message. | <pre>public class ExtractMultipleDates {<br>    public static void main(String[] args) {<br>        String text = "Important dates: 2025-01-23, 2025-02-14, and 2025-03-01.";<br><br>        // Define the date pattern<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");<br><br>        // Split the string to find dates<br>        String[] parts = text.split(", \| and ");<br><br>        for (String part : parts) {<br>            try {<br>                LocalDate date = LocalDate.parse(part.trim(), formatter);<br>                System.out.println("Extracted date: " + date);<br>            } catch (DateTimeParseException e) {<br>                System.out.println("Error parsing date: " + part.trim());<br>            }<br>        }</pre> |
| Close curly braces to end the `ExtractMultipleDates` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program extracts multiple dates from a given text, parses them into `LocalDate` objects, and prints them in a structured format. It also handles potential errors if any part of the text is not in the expected date format.

## Example of extracting dates from mixed content

| Description | Example |
|--------|--------|
| Import the `LocalDate`, `DateTimeFormatter`, and `DateTimeParseException` classes, which are part of the Java Date and Time API class and used to represent dates without a time zone, define a pattern for parsing and formatting dates, and handle errors if the date format is incorrect. | <pre>import java.time.LocalDate;<br>import java.time.format.DateTimeFormatter;<br>import java.time.format.DateTimeParseException;</pre> |
| Create a public class `ExtractDatesFromMixedContent` that contains the Java `main` method and define a string named `mixedContent` containing a mixture of text and two dates (2025-01-23 and 2025-02-28). The dates are in the \"yyyy-MM-dd\" format. These dates are separated by commas and the word \"and\". Define the date format using `DateTimeFormatter.ofPattern("yyyy-MM-dd")`. Splits the input string by spaces into individual words. The resulting `words[]` array contains both text and possible date strings. Iterate over each word using the regex `word.matches("\\d{4}-\\d{2}-\\d{2}")` and check if it matches the date pattern (yyyy-MM-dd). If a word matches the pattern, attempt to parse it into a LocalDate using the previously defined formatter. If parsing is successful, prints the extracted date. If there is a parsing error (invalid date), the `try-catch` block handles it and prints an error message. | <pre>public class ExtractDatesFromMixedContent {<br>    public static void main(String[] args) {<br>        String mixedContent = "Please note that our deadlines are on 2025-01-23 and 2025-02-28.";<br><br>        // Define the date pattern<br>        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");<br><br>        // Split based on spaces and check each part<br>        String[] words = mixedContent.split(" ");<br><br>        for (String word : words) {<br>            if (word.matches("\\\d{4}-\\\d{2}-\\\d{2}")) { // Check if it matches a date pattern<br>                try {<br>                    LocalDate date = LocalDate.parse(word, formatter);<br>                    System.out.println("Extracted date: " + date);<br>                } catch (DateTimeParseException e) {<br>                    System.out.println("Error parsing date: " + word);<br>                }<br>            }<br>        }<br></pre> |
| Close curly braces to end the `ExtractDatesFromMixedContent` class definition. | <pre>    }<br>}</pre> |

**Explanation:** This Java program extracts dates from a string containing mixed content (text and dates), parses them into `LocalDate` objects, and prints the valid dates. If any date format is invalid, it gracefully handles the error.



## Author(s)
Ramanujam Srinivasan
Lavanya Thiruvali Sunderarajan

<br>
<br>
<br>

![SN IBM Footer](https://cf-courses-data.s3.us.cloud-object-storage.appdomain.cloud/jrorbnz20h5VzD06sTlolg/ibmsn-footer-blue.png "SN IBM Footer")

<!--## Changelog
| Date | Version | Changed by | Change Description |
|------|--------|--------|---------|
| 2025-02-28 | 0.1 | P.Kravitz  | Template created |
| 2025-03-11 | 0.2 | A.Narula  | Cheatsheet completed |
| 2025-03-12 | 0.3 | A. Hansis  | Content QA |
-->