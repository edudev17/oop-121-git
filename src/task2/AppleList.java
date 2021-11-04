package task2;

public class AppleList {
	private Apple[] lst;

    //Конструктор
    public AppleList(int n)
    {
        lst = new Apple[n];
    }

    public void addApple(Apple apl, int index)
    {
        lst[index] = apl;
    }
	
	private double calculateAverageVolume() {
        double sum = 0;
        for (int i = 0; i < lst.length; i++)
            sum += lst[i].calculateVolume();
        return sum/lst.length;
    }

    public void printList()
    {
        System.out.format("|%1$-10s|%2$-10s|%3$-8s|%4$-8s|\n", "Color", "Sort", "Diameter", "Volume");
        for (Apple apl : lst)
        {
            System.out.format("|%1$-10s|%2$-10s|%3$-8.2f|%4$.2f|\n", apl.getSort(), apl.getColor(),
           		 apl.getDiameter(), apl.calculateVolume());
        }
        System.out.format("\nAverage Volume:%36.2f",  calculateAverageVolume());
    }
}