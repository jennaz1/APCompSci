public class StepTracker{
    int steps = 0;
    int days = 0;
    int activeDays=0;
    int minimumSteps = 0;
    
    public StepTracker(int m){
        minimumSteps = m;
    }
    public void addDailySteps(int steps){
        steps += this.steps;
        days+=1;
        if (steps>=minimumSteps){
            activeDays+=1;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        return (1.0)*steps/days;
    }
}