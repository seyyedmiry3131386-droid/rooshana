package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class qv extends tu0 {
    public final /* synthetic */ int b;
    public final a94 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(px3 px3Var, int i) {
        super(px3Var);
        this.b = i;
        switch (i) {
            case 1:
                super(px3Var);
                no7 descriptor = px3Var.getDescriptor();
                js3.p(descriptor, "elementDesc");
                this.c = new mv(descriptor, 2);
                break;
            default:
                js3.p(px3Var, "element");
                no7 descriptor2 = px3Var.getDescriptor();
                js3.p(descriptor2, "elementDesc");
                this.c = new mv(descriptor2, 1);
                break;
        }
    }

    @Override // defpackage.p
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.p
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                js3.p(arrayList, "<this>");
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                js3.p(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.p
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        js3.p(collection, "<this>");
        return collection.iterator();
    }

    @Override // defpackage.p
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        js3.p(collection, "<this>");
        return collection.size();
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                js3.p(null, "<this>");
                return new ArrayList((Collection) null);
            default:
                js3.p(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        switch (this.b) {
        }
        return (mv) this.c;
    }

    @Override // defpackage.p
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                js3.p(arrayList, "<this>");
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                js3.p(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // defpackage.tu0
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                js3.p(arrayList, "<this>");
                arrayList.add(i, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                js3.p(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
