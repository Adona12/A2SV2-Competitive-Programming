public class OperatingSystem {
    public static void main(String[] args) {
        int[] processes={1,2,3,4};
        int[] arrivalTime={0,0,0,0};
        int[] Burst_time={53,17,68,24};
        OperatingSystem s=new OperatingSystem();
        s.round_robin(processes,arrivalTime,Burst_time,20,4);
    }
    void round_robin(int processes[], int arrivalTime[], int Burst_time[], int quantum, int number_of_process) {
        int[] Waiting=new int[number_of_process];
        int[] TurnAround=new int[number_of_process];
        int[] completion=new int[number_of_process];
        sorting(arrivalTime, Burst_time, processes, Waiting, TurnAround, completion, number_of_process, false);
        waitingTimeRR(Waiting, arrivalTime, Burst_time, quantum, number_of_process);
        turnAroundTime(TurnAround, Waiting, Burst_time, number_of_process);
        float avg_Waiting = avgWaiting(Waiting, number_of_process);
        float avg_turnAround = avgTurnAround(TurnAround, number_of_process);
        avgTurnAround(TurnAround, number_of_process);
        print(processes, arrivalTime, Burst_time, completion, TurnAround, Waiting, avg_Waiting, avg_turnAround,
                number_of_process);
    }
    float avgTurnAround(int turnAround_time[], int number_of_process) {
        int total = 0;
        for (int counter = 0; counter < number_of_process; counter++) {
            total += turnAround_time[counter];
        }
        return total / number_of_process;

    }
    float avgWaiting(int waiting_time[], int number_of_process) {
        int total = 0;
        for (int counter = 0; counter < number_of_process; counter++) {
            total += waiting_time[counter];
        }
        return total / number_of_process;
    }

    void turnAroundTime(int turnAround[], int waiting[], int Burst_time[], int number_of_process) {
        for (int counter = 0; counter < number_of_process; counter++) {
            turnAround[counter] = waiting[counter] + Burst_time[counter];
        }

    }
    void waitingTimeRR(int waiting[], int arrival[], int burst_time[], int quantum, int number_of_process) {
        int[] remaining_burst=new int[number_of_process];
        int completed = 0, time = 0;
        for (int counter = 0; counter < number_of_process; counter++) {
            remaining_burst[counter] = burst_time[counter];
        }
        while (completed != number_of_process) {

            for (int i = 0; i < number_of_process; i++) {

                if (arrival[i] <= time) {
                    System.out.println(arrival[i]);
                    if (remaining_burst[i] > 0) {
                        if (remaining_burst[i] > quantum) {
                            time += quantum;

                            remaining_burst[i] -= quantum;

                        } else {

                            time += remaining_burst[i];

                            remaining_burst[i] = 0;
                            waiting[i] = time - burst_time[i] - arrival[i];
                            completed++;

                        }
                    }
                }
                else{
                    time++;
                }
            }

        }
        System.out.println("here 1");
    }
    void sorting(int sorting[], int burst_time[], int proceses[], int array1[], int array2[], int array3[],
                 int number_of_processes, boolean first) {
        int sorting_temp, burst_temp, process_temp, array1_temp, array2_temp, array3_temp;
        for (int i = 0; i < number_of_processes; i++) {
            for (int j = i + 1; j < number_of_processes; j++) {
                if (sorting[j] < sorting[i]) {

                    if (first) {
                        array2_temp = array2[i];
                        array3_temp = array3[i];
                        array1_temp = array1[i];

                        array2[i] = array2[j];
                        array3[i] = array3[j];
                        array1[i] = array1[j];

                        array1[j] = array1_temp;
                        array2[j] = array2_temp;
                        array3[j] = array3_temp;

                    }

                    sorting_temp = sorting[i];
                    process_temp = proceses[i];
                    burst_temp = burst_time[i];


                    sorting[i] = sorting[j];
                    proceses[i] = proceses[j];
                    burst_time[i] = burst_time[j];


                    sorting[j] = sorting_temp;
                    proceses[j] = process_temp;
                    burst_time[j] = burst_temp;


                }

            }
        }
        System.out.println("here");
    }
    void print(int processes[], int arrivalTime[], int burstTime[], int completion[], int TurnAround[], int Waiting[],
               float avg_waiting, float avg_turnaround, int number_of_process) {
        System.out.println("Process ID     Arrival Time    Burst Time   Turnaround Time");
        for (int counter = 0; counter < number_of_process; counter++) {
            System.out.println(processes[counter] +"     |            "+arrivalTime[counter]+ "     |       " +burstTime[counter]+ "      |          "+TurnAround[counter]+"      |          ");

        }
        System.out.println("Average waiting time   " +avg_waiting );
        System.out.println("Average turnaround time   " +avg_turnaround );

    }
}

