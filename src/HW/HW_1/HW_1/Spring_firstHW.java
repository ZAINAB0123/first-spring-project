package HW_1;

public class Spring_firstHW {

    public enum DayOfWeekEnum {
        MONDAY("Monday", "Понедельник"),
        TUESDAY("Tuesday", "Вторник"),
        WEDNESDAY("Wednesday", "Среда"),
        THURSDAY("Thursday", "Четверг"),
        FRIDAY("Friday", "Пятница"),
        SATURDAY("Saturday", "Суббота"),
        SUNDAY("Sunday", "Воскресенье");

        private final String englishName;
        private final String russianName;

        DayOfWeekEnum(String englishName, String russianName) {
            this.englishName = englishName;
            this.russianName = russianName;
        }

        public String getEnglishName() {
            return englishName;
        }

        public String getRussianName() {
            return russianName;
        }

        // Метод для получения русского названия дня по английскому
        public static String getRussianNameByEnglish(String english) {
            for (DayOfWeekEnum day : values()) {
                if (day.getEnglishName().equalsIgnoreCase(english)) {
                    return day.getRussianName();
                }
            }
            return null; // Если день не найден
        }
    }
}