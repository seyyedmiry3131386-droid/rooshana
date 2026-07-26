package defpackage;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class t42 implements d82 {
    public final /* synthetic */ int a;

    public /* synthetic */ t42(int i) {
        this.a = i;
    }

    @Override // defpackage.pn6
    public final Object get() {
        switch (this.a) {
            case 0:
                return new sw2(Executors.newSingleThreadExecutor());
            default:
                vs8 vs8Var = new vs8();
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(Priority.a, new a30(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(Priority.c, new a30(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig$Flag.b)));
                if (setUnmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                map.put(Priority.b, new a30(86400000L, 86400000L, setUnmodifiableSet));
                if (map.keySet().size() < Priority.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new z20(vs8Var, map);
        }
    }
}
