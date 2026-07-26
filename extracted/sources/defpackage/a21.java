package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a21 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final xf3 c;
    public final PendingIntent d;
    public final xp7 e;
    public final cb6 f;
    public final cb6 g;
    public final Bundle h;
    public final Bundle i;
    public final he6 j;
    public final ImmutableList k;
    public final ImmutableList l;
    public final MediaSession.Token m;
    public final ImmutableList n;

    static {
        String str = j29.a;
        o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(14, 36);
        t = Integer.toString(13, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(11, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public a21(int i, int i2, xf3 xf3Var, PendingIntent pendingIntent, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, xp7 xp7Var, cb6 cb6Var, cb6 cb6Var2, Bundle bundle, Bundle bundle2, he6 he6Var, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = xf3Var;
        this.d = pendingIntent;
        this.k = immutableList;
        this.l = immutableList2;
        this.n = immutableList3;
        this.e = xp7Var;
        this.f = cb6Var;
        this.g = cb6Var2;
        this.h = bundle;
        this.i = bundle2;
        this.j = he6Var;
        this.m = token;
    }

    public static a21 a(Bundle bundle) {
        ImmutableList immutableListQ;
        ImmutableList immutableListQ2;
        ImmutableList immutableListQ3;
        xf3 xf3Var;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof z11) {
            return ((z11) binder).n;
        }
        int i = bundle.getInt(o, 0);
        int i2 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            lj3 lj3VarM = ImmutableList.m();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                lj3VarM.O(cw0.d(i2, bundle2));
            }
            immutableListQ = lj3VarM.S();
        } else {
            immutableListQ = ImmutableList.q();
        }
        ImmutableList immutableList = immutableListQ;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            lj3 lj3VarM2 = ImmutableList.m();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                lj3VarM2.O(cw0.d(i2, bundle3));
            }
            immutableListQ2 = lj3VarM2.S();
        } else {
            immutableListQ2 = ImmutableList.q();
        }
        ImmutableList immutableList2 = immutableListQ2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            lj3 lj3VarM3 = ImmutableList.m();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                lj3VarM3.O(cw0.d(i2, bundle4));
            }
            immutableListQ3 = lj3VarM3.S();
        } else {
            immutableListQ3 = ImmutableList.q();
        }
        ImmutableList immutableList3 = immutableListQ3;
        Bundle bundle5 = bundle.getBundle(u);
        xp7 xp7VarA = bundle5 == null ? xp7.b : xp7.a(bundle5);
        Bundle bundle6 = bundle.getBundle(w);
        cb6 cb6VarB = bundle6 == null ? cb6.b : cb6.b(bundle6);
        Bundle bundle7 = bundle.getBundle(v);
        cb6 cb6VarB2 = bundle7 == null ? cb6.b : cb6.b(bundle7);
        Bundle bundle8 = bundle.getBundle(x);
        Bundle bundle9 = bundle.getBundle(y);
        Bundle bundle10 = bundle.getBundle(z);
        he6 he6VarO = bundle10 == null ? he6.F : he6.o(i2, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i6 = is4.s;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xf3)) {
            tf3 tf3Var = new tf3();
            tf3Var.n = iBinder;
            xf3Var = tf3Var;
        } else {
            xf3Var = (xf3) iInterfaceQueryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new a21(i, i2, xf3Var, pendingIntent, immutableList, immutableList2, immutableList3, xp7VarA, cb6VarB2, cb6VarB, bundle12, bundle11, he6VarO, token);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putBinder(p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        ImmutableList immutableList = this.k;
        boolean zIsEmpty = immutableList.isEmpty();
        String str = r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                arrayList.add(((cw0) it.next()).g());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        ImmutableList immutableList2 = this.l;
        if (!immutableList2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(immutableList2.size());
                Iterator<E> it2 = immutableList2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((cw0) it2.next()).g());
                }
                bundle.putParcelableArrayList(s, arrayList2);
            } else {
                ImmutableList immutableListE = cw0.e(immutableList2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(immutableListE.size());
                p0 p0VarListIterator = immutableListE.listIterator(0);
                while (p0VarListIterator.hasNext()) {
                    arrayList3.add(((cw0) p0VarListIterator.next()).g());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        ImmutableList immutableList3 = this.n;
        if (!immutableList3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(immutableList3.size());
            Iterator<E> it3 = immutableList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((cw0) it3.next()).g());
            }
            bundle.putParcelableArrayList(t, arrayList4);
        }
        xp7 xp7Var = this.e;
        xp7Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        zx8 it4 = xp7Var.a.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((wp7) it4.next()).b());
        }
        bundle2.putParcelableArrayList(xp7.c, arrayList5);
        bundle.putBundle(u, bundle2);
        String str2 = v;
        cb6 cb6Var = this.f;
        bundle.putBundle(str2, cb6Var.c());
        String str3 = w;
        cb6 cb6Var2 = this.g;
        bundle.putBundle(str3, cb6Var2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.n(y97.J(cb6Var, cb6Var2), false, false).q(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
