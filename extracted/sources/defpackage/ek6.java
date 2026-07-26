package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ek6 implements Comparator {
    public static final /* synthetic */ ek6 b = new ek6(14);
    public final /* synthetic */ int a;

    public /* synthetic */ ek6(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((m18) obj).b - ((m18) obj2).b;
            case 1:
                ((ks5) obj2).getClass();
                ((ks5) obj).getClass();
                return bt2.t(2, 2);
            case 2:
                throw bl4.n(obj2);
            case 3:
                return bt2.t(Long.valueOf(((ex6) obj2).a.getDatabaseTimestamp()), Long.valueOf(((ex6) obj).a.getDatabaseTimestamp()));
            case 4:
                return bt2.t(Long.valueOf(((ex6) obj2).a.getDatabaseTimestamp()), Long.valueOf(((ex6) obj).a.getDatabaseTimestamp()));
            case 5:
                return bt2.t(Long.valueOf(((ex6) obj2).a.getDatabaseTimestamp()), Long.valueOf(((ex6) obj).a.getDatabaseTimestamp()));
            case 6:
                return bt2.t((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return bt2.t((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 8:
                ((eu7) obj).getClass();
                throw null;
            case 9:
                return bt2.t(((ie8) obj).a, ((ie8) obj2).a);
            case 10:
                return bt2.t(((ke8) obj).a, ((ke8) obj2).a);
            case 11:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 12:
                return ((g89) obj).b - ((g89) obj2).b;
            case 13:
                return bt2.t(((yg9) obj).a, ((yg9) obj2).a);
            case 14:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }
}
