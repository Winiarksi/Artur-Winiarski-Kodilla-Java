package Module_6.Module_6_5_Zadanie;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class CalculatorStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public void caclulateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.userName().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.comentstCount();
        averageNumberOfPostsPerUser = (double)numberOfPosts/(double)numberOfUsers;
        averageNumberOfCommentsPerUser = (double)numberOfComments/(double)numberOfUsers;
        averageNumberOfCommentsPerPost = (double)numberOfComments/(double)numberOfPosts;
    }

    public void showStatistics(){

        System.out.println("NumberOfUsers: " + numberOfUsers);
        System.out.println("NumberOfPosts: " + numberOfPosts);
        System.out.println("NumberOfComments: " + numberOfComments);
        System.out.println("AverageNumberOfPostsPerUser: " + averageNumberOfPostsPerUser);
        System.out.println("AverageNumberOfCommentsPerUser: " + averageNumberOfCommentsPerUser);
        System.out.println("AverageNumberOfCommentsPerPost: " + averageNumberOfCommentsPerPost);
        }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}
