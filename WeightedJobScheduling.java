package Dynamic_Programming;

import java.util.Arrays;
import java.util.Comparator;

/*Weighted Job Scheduling in O(n Log n) time :-
Given N jobs where every job is represented by following three elements of it.
Start Time
Finish Time
Profit or Value Associated

Find the maximum profit subset of jobs such that no two jobs in the subset overlap.
Input: Number of Jobs n = 4
Job Details {Start Time, Finish Time, Profit}
Job 1:  {1, 2, 50} 
Job 2:  {3, 5, 20}
Job 3:  {6, 19, 100}
Job 4:  {2, 100, 200}
Output: The maximum profit is 250.
We can get the maximum profit by scheduling jobs 1 and 4.
Note that there is longer schedules possible Jobs 1, 2 and 3 
but the profit with this schedule is 20+50+100 which is less than 250. */

class Job {
	int start, finish, profit;
	Job(int start, int finish, int profit) {
		this.start = start;
		this.finish = finish;
		this.profit = profit;
	}
}

public class WeightedJobScheduling {
	public static void main(String[] args) {
		Job jobs[] = { new Job(1, 2, 50), new Job(3, 5, 20), new Job(6, 19, 100), new Job(2, 100, 200) };
		System.out.println("Optimal profit is " + schedule(jobs)); //Optimal profit is 250
	}

	static public int schedule(Job jobs[]) {
		Arrays.sort(jobs, new JobComparator());
		int n = jobs.length;
		int table[] = new int[n];
		table[0] = jobs[0].profit;
		for (int i = 1; i < n; i++) {
			int inclProf = jobs[i].profit;
			int l = binarySearch(jobs, i);
			if (l != -1)
				inclProf += table[l];
			table[i] = Math.max(inclProf, table[i - 1]);
		}
		return table[n - 1];
	}

	static public int binarySearch(Job jobs[], int index) {
		int lo = 0, hi = index - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (jobs[mid].finish <= jobs[index].start) {
				if (jobs[mid + 1].finish <= jobs[index].start)
					lo = mid + 1;
				else
					return mid;
			} else
				hi = mid - 1;
		}
		return -1;
	}

}

class JobComparator implements Comparator<Job> {
	public int compare(Job a, Job b) {
		return a.finish < b.finish ? -1 : a.finish == b.finish ? 0 : 1;
	}
}