public class YearProgressbar {

    public double percentage(String currentDate) {
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] data = currentDate.split(" ");
        int year = Integer.parseInt(data[2]);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            days[1]++;
        }
        int daysCount = 0;
        for (int i = 0; i < days.length; i++) {
            daysCount += days[i];
        }
        double total = 60 * 24 * daysCount;

        int currentDays = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(data[0])) {
                break;
            }
            currentDays += days[i];
        }
        currentDays += Integer.parseInt(data[1].substring(0, 2)) - 1;
        int hours = Integer.parseInt(data[3].substring(0, 2));
        int minutes = Integer.parseInt(data[3].substring(3));
        double current = minutes + (hours * 60) + (currentDays * 60 * 24);
        return (current / total) * 100;
    }
}
