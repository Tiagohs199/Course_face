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
		
		System.out.println(p1);
	}

}