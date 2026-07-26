package junit.framework;

import java.util.HashMap;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes3.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, Object> {
    private static final long serialVersionUID = 1;

    static {
        new JUnit4TestAdapterCache();
    }
}
