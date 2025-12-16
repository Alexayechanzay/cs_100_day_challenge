package the_basics;

//
public class variables {
    public static void main(String[] args){

        String FbName = "CodeWall Technologies"; // var initialization
        String courses; // variable declaration (Declare var for future use)
        int FbFollower = 49000;

        System.out.println(FbName);
        FbName = "Lumbini Academy";
        System.out.println(FbName+" "+FbFollower);

        FbName = FbName + " (Mandalay)";
        System.out.println(FbName);

        // key word (var) is used for declaring unknown data types
        var name = "Coder";
        System.out.println(name);


    }
}
