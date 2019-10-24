using System;

namespace Kattis_CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            string line;
            int highestScore = 0;
            int currentParticipant = 0;
            int bestParticipant = 0;
            while ((line = Console.ReadLine()) != null)
            {
                string[] scores = line.Split(" ");
                currentParticipant++;
                int sum = 0;
                foreach (string score in scores)
                {
                    sum += Int32.Parse(score);
                }
                if (sum > highestScore)
                {  
                    highestScore = sum;
                    bestParticipant = currentParticipant;
                }
            }
            Console.WriteLine( bestParticipant + " " + highestScore);
        }
    }
}
