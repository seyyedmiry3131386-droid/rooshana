package androidx.core.os;

import android.os.OutcomeReceiver;
import defpackage.om0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final OutcomeReceiver a(om0 om0Var) {
        return new ContinuationOutcomeReceiver(om0Var);
    }
}
