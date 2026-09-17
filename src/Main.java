//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    double balance = 5000.0;
    double RATE = .17;

    // first month:
    balance = balance + balance + RATE; //

    IO.println("The balance after one month is " + balance);

    // second month
    balance = balance + balance + RATE;

    IO.println("The balance after two months is " + balance);
}
