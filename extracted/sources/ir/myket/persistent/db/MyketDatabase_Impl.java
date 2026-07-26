package ir.myket.persistent.db;

import defpackage.bp2;
import defpackage.c24;
import defpackage.g27;
import defpackage.he5;
import defpackage.k85;
import defpackage.ps0;
import defpackage.ul0;
import defpackage.vz1;
import ir.myket.persistent.db.MyketDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketDatabase_Impl extends MyketDatabase {
    public final c24 k;
    public final c24 l;

    public MyketDatabase_Impl() {
        final int i = 0;
        this.k = kotlin.a.a(new bp2(this) { // from class: ge5
            public final /* synthetic */ MyketDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new k85(this.b);
                    default:
                        return new ul0(this.b);
                }
            }
        });
        final int i2 = 1;
        this.l = kotlin.a.a(new bp2(this) { // from class: ge5
            public final /* synthetic */ MyketDatabase_Impl b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new k85(this.b);
                    default:
                        return new ul0(this.b);
                }
            }
        });
    }

    @Override // androidx.room.d
    public final List a(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.d
    public final androidx.room.a b() {
        return new androidx.room.a(this, new LinkedHashMap(), new LinkedHashMap(), "movie_watch_progress", "callback_url");
    }

    @Override // androidx.room.d
    public final vz1 c() {
        return new he5(this);
    }

    @Override // androidx.room.d
    public final Set e() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.d
    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ps0 ps0VarA = g27.a(k85.class);
        EmptyList emptyList = EmptyList.a;
        linkedHashMap.put(ps0VarA, emptyList);
        linkedHashMap.put(g27.a(ul0.class), emptyList);
        return linkedHashMap;
    }

    @Override // ir.myket.persistent.db.MyketDatabase
    public final ul0 k() {
        return (ul0) this.l.getValue();
    }

    @Override // ir.myket.persistent.db.MyketDatabase
    public final k85 l() {
        return (k85) this.k.getValue();
    }
}
