package ai.ineuron.DoubtSession;

interface Movie {

	void watching();
}

public class LambdaDemo  {
	public static void main(String[] args) {
		Movie movie = () -> System.out.println("Am watching a movie using a Lambda expression");

		movie.watching();
	}
}
