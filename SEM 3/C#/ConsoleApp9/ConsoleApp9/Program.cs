class Program
{
    static void Main(string[] args)
    {
        string[] friends = { "Ashil", "Likith", "Lailesh", "Hrithik", "Lynel" };
        int vowelCount = 0;
        for (int i = 0; i < friends.Length; i++)
        {
            string friendName = friends[i];
            char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
            foreach (char c in friendName)
            {
                if (vowels.Contains(c))
                {
                    vowelCount++;
                }
            }
        }
        Console.WriteLine("Total number of vowels in all friend's names: " + vowelCount);
    }
}
