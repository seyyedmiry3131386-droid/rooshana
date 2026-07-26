package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jl implements Appendable {
    public final StringBuilder a = new StringBuilder(16);
    public final ArrayList b;

    public jl(ll llVar) {
        new ArrayList();
        this.b = new ArrayList();
        new ArrayList();
        a(llVar);
    }

    public final void a(ll llVar) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(llVar.b);
        List list = llVar.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kl klVar = (kl) list.get(i);
                this.b.add(new il(klVar.b + length, klVar.c + length, klVar.a, klVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof ll) {
            a((ll) charSequence);
            return this;
        }
        this.a.append(charSequence);
        return this;
    }

    public final ll b() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            il ilVar = (il) arrayList.get(i);
            int length = sb.length();
            int i2 = ilVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (!(length != Integer.MIN_VALUE)) {
                sn3.b("Item.end should be set first");
            }
            arrayList2.add(new kl(ilVar.b, length, ilVar.a, ilVar.d));
        }
        return new ll(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof ll;
        StringBuilder sb = this.a;
        if (z) {
            ll llVar = (ll) charSequence;
            int length = sb.length();
            sb.append((CharSequence) llVar.b, i, i2);
            List listA = ml.a(llVar, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    kl klVar = (kl) listA.get(i3);
                    this.b.add(new il(klVar.b + length, klVar.c + length, klVar.a, klVar.d));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }
}
