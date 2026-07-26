package defpackage;

import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public abstract class mr1 extends rq4 {
    public static final /* synthetic */ int p = 0;

    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", Marker.ANY_NON_NULL_MARKER));
    }
}
