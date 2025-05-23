import facade.MovieStreamingFacade;

public class Main {
    public static void main(String[] args) {
        MovieStreamingFacade movieStreamingFacade = new MovieStreamingFacade();
        movieStreamingFacade.startMovie();
        System.out.println();
        movieStreamingFacade.stopMovie();
    }
}