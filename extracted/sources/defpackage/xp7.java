package defpackage;

import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class xp7 {
    public static final xp7 b = new xp7(new HashSet());
    public static final String c;
    public final ImmutableSet a;

    static {
        String str = j29.a;
        c = Integer.toString(0, 36);
    }

    public xp7(HashSet hashSet) {
        this.a = ImmutableSet.n(hashSet);
    }

    public static xp7 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            wn5.k0("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(wp7.a((Bundle) parcelableArrayList.get(i)));
        }
        return new xp7(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xp7) {
            return this.a.equals(((xp7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
