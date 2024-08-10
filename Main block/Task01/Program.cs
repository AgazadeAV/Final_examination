void ShowNumbers(int n, int m)
{
    if (n > m)
    {
        return;
    }
    Console.Write($"{n} ");
    ShowNumbers(n + 1, m);
}

ShowNumbers(3, 14);