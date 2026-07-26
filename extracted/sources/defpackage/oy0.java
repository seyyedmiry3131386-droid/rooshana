package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class oy0 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final c24 f;
    public final c24 g;

    public oy0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final int i = 0;
        this.f = a.a(new bp2(this) { // from class: my0
            public final /* synthetic */ oy0 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        oy0 oy0Var = this.b;
                        List list6 = oy0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            kotlin.collections.a.b0((List) ((bp2) list6.get(i2)).invoke(), arrayList);
                        }
                        oy0Var.d = EmptyList.a;
                        return arrayList;
                    default:
                        oy0 oy0Var2 = this.b;
                        List list7 = oy0Var2.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            kotlin.collections.a.b0((List) ((bp2) list7.get(i3)).invoke(), arrayList2);
                        }
                        oy0Var2.e = EmptyList.a;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.g = a.a(new bp2(this) { // from class: my0
            public final /* synthetic */ oy0 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        oy0 oy0Var = this.b;
                        List list6 = oy0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i22 = 0; i22 < size; i22++) {
                            kotlin.collections.a.b0((List) ((bp2) list6.get(i22)).invoke(), arrayList);
                        }
                        oy0Var.d = EmptyList.a;
                        return arrayList;
                    default:
                        oy0 oy0Var2 = this.b;
                        List list7 = oy0Var2.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            kotlin.collections.a.b0((List) ((bp2) list7.get(i3)).invoke(), arrayList2);
                        }
                        oy0Var2.e = EmptyList.a;
                        return arrayList2;
                }
            }
        });
    }
}
