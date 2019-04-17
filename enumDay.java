enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class enumDay
{
    public static void main(String[] args){
        Day d = Day.MONDAY;
        switch (d) {
            case SATURDAY: System.out.println("Yeah!"); break;
            case SUNDAY: System.out.println("Happy!"); break;
            default: System.out.println("Noooo"); break;
        }
    }
}
    
