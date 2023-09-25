class MyCalendar {
    
    public ArrayList<int[]> schedule;

    public MyCalendar() {
        schedule = new ArrayList<int[]>();
    }
    
    public boolean book(int start, int end) {
        for (int i[] : schedule) {
            if (start < i[1] && end > i[1]) return false;
            if (end > i[0] && start < i[0]) return false;
            if (start >= i[0] && end <= i[1]) return false;
        }
        int booking[] = {start, end};
        schedule.add(booking);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
