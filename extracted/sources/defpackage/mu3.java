package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.nearby.zzeu;
import com.j256.ormlite.stmt.query.SimpleComparison;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class mu3 implements ao9 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ mu3(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ao9
    public void a(zm9 zm9Var) {
        kp9 kp9Var = (kp9) zm9Var.getService();
        zzeu zzeuVar = new zzeu();
        zzeuVar.a = this.b;
        Parcel parcelN0 = kp9Var.n0();
        int i = lm9.a;
        parcelN0.writeInt(1);
        zzeuVar.writeToParcel(parcelN0, 0);
        kp9Var.o0(2009, parcelN0);
    }

    public void b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(d(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(d(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }

    public CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return bl4.y(new StringBuilder(SimpleComparison.LESS_THAN_OPERATION), this.b, '>');
            default:
                return super.toString();
        }
    }

    public mu3(String str) {
        this.a = 0;
        str.getClass();
        this.b = str;
    }

    public mu3(mu3 mu3Var) {
        this.a = 0;
        this.b = mu3Var.b;
    }
}
