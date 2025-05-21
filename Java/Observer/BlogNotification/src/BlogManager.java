import listeners.BlogType;
import org.w3c.dom.events.Event;
import publisher.EventManager;

public class BlogManager {
    public final EventManager events;

    public BlogManager() {
        this.events = new EventManager( BlogType.FASHION,
                                        BlogType.ENTERTAINMENT,
                                        BlogType.ENTERTAINMENT,
                                        BlogType.TECH,
                                        BlogType.GAMING,
                                        BlogType.AI
                                        );
    }
}
