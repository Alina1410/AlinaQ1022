import homeWork1.*;
import homeWork2.Fibonacci;
import homeWork2.SumMinMax;
import homeWork3.ArrayClass;
import homeWork3.MonthName;
import homeWork3.MyDeprecated;
import homeWork3.Season;

public class Main {
    public static void main(String[] args) {


        //   LetterIf letterIf = new LetterIf();
        //   letterIf.operatorIf();


        //     LetterSwitch letterSwitch = new LetterSwitch();
        //    letterSwitch.operatorSwitch();


        //   Seasons seasons = new Seasons();
        //seasons.month();


        //    Exit exit = new Exit();
        //    exit.input();


        // Sum sum = new Sum();
        //     sum.arithmetic();


        //     Fibonacci fib = new Fibonacci();
        //     fib.fibonacci();


        //SumMinMax sumMinMax = new SumMinMax();
        //sumMinMax.min_max();


        //      Difference difference = new Difference();
        //      difference.diff();


        //   Season season=new Season();
        //   season.mounth(MonthName.DESEMBER);


        //MyDeprecated myDeprecated = new MyDeprecated();
        //myDeprecated.perimeter();

        int[] arr = {2, 13, 4, -7, 15, 48, -4};
        ArrayClass arrayClass = new ArrayClass();
        arrayClass.printSortArray(arr);
        arrayClass.printMaxValue(arr);
        arrayClass.printMinValue(arr);
        arrayClass.printElement(arr,5);
        arrayClass.printDivinEvenOdd(arr);
    }


}


















