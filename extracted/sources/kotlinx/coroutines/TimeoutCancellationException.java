package kotlinx.coroutines;

import defpackage.wt3;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient wt3 a;

    public TimeoutCancellationException(String str, wt3 wt3Var) {
        super(str);
        this.a = wt3Var;
    }
}
