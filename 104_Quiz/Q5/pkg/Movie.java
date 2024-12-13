package pkg;

public class Movie{
    String movieName ="";
    double rating=0.0;
    int numRatings = 0;
    int revenue = 0;
    
    public Movie(){
        movieName="Avengers";
        rating=8.0;
        numRatings=33;
        revenue=623357910;
        
    }
    
    public Movie(String movieName,double rating,int numRatings,int revenue){
        this.movieName=movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue=revenue;
        
    }
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of Ratings: "+numRatings);
        System.out.println("Revenue: "+revenue+"\n");
        
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
        
    }
    public void addRating(double rating){
       
       
       this.rating=(this.rating*numRatings+rating)/(this.numRatings+1);
       this.numRatings+=1;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie a){
        return this.rating>a.getRating();
        
    }
    public String revenueToString(){
        String stringRevenue = "";
        while(revenue>0){
            stringRevenue=(revenue%1000)+","+stringRevenue;
            revenue=revenue/1000;
            
        }
        return stringRevenue;
    }
    
    public Movie pirateMovie(){
        movieName = this.movieName;
        rating = this.rating;
        numRatings= this.numRatings;
        revenue= this.revenue;
        return new Movie(movieName,rating, numRatings,revenue);
    }

}
