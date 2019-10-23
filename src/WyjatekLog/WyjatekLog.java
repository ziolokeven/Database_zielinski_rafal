package WyjatekLog;

/**
 *
 * @author Rafal
 */
public class WyjatekLog extends RuntimeException {
    public WyjatekLog(String errorMessage, Throwable err){
        super(errorMessage);
    }
    
}
