package facebook;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post("Traveling to New Zealan","I'm going to visit this wonderfull country",12, sdf.parse("21/06/2020 14:00:50"));
		

		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("have a nice beer trip!");
		Comment c4 = new Comment("Wow that's awesome, I wish a good trip");
		Post p2 = new Post("Traveling to Germany","I'm going to drink all",23, sdf.parse("17/06/2020 10:00:00"));
		

		
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p1);
		System.out.println(p2);
	}

}