package com.microsoft.clarity.d;

import com.microsoft.clarity.q.l;
import defpackage.mh9;
import defpackage.rm7;
import j$.util.Comparator;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public final List a = Arrays.asList("maxp", "cmap");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public final ArrayList a(com.microsoft.clarity.e.b bVar, int i, int i2, Set set) throws IOException {
        char c;
        byte[] bArr;
        ArrayList arrayList;
        byte[] bArr2;
        i iVar;
        char c2;
        a aVar;
        int i3 = i2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        byte[] bArrA = bVar.a(4);
        char c3 = Arrays.equals(bArrA, c.a) ? (char) 1 : Arrays.equals(bArrA, c.b) ? (char) 2 : Arrays.equals(bArrA, c.c) ? (char) 3 : (char) 4;
        if (c3 == 4) {
            return arrayList2;
        }
        PriorityQueue priorityQueue = new PriorityQueue(Comparator.CC.comparingLong(new mh9()));
        long j = 0;
        boolean z = false;
        if (c3 == 3) {
            if ((bVar.a() | bVar.a()) < 0) {
                throw new EOFException();
            }
            if ((bVar.c() / 65536.0f) + ((short) ((r12 << 8) + r13)) >= 2.0f) {
                bVar.b();
                bVar.b();
                bVar.b();
            }
            int iB = (int) bVar.b();
            if (iB <= 0 || iB > 1024) {
                throw new IOException(rm7.n(iB, "Invalid number of fonts: "));
            }
            int i4 = 0;
            while (i4 < iB) {
                priorityQueue.add(new d(bVar.b()));
                i4++;
                c3 = c3;
            }
            c = c3;
        } else {
            c = c3;
            priorityQueue.add(new d(0L));
        }
        while (!priorityQueue.isEmpty()) {
            e eVar = (e) priorityQueue.poll();
            long j2 = j;
            long j3 = i;
            long jA = eVar.a() + j3;
            com.microsoft.clarity.m.d dVar = bVar.a;
            PriorityQueue priorityQueue2 = priorityQueue;
            long j4 = jA - ((long) dVar.b);
            int i5 = (int) j4;
            if (j4 != i5) {
                throw new ArithmeticException();
            }
            dVar.a(i5, z);
            if (eVar instanceof d) {
                char c4 = c;
                if (c4 == 3) {
                    com.microsoft.clarity.m.d dVar2 = bVar.a;
                    int i6 = (int) 4;
                    if (4 != i6) {
                        throw new ArithmeticException();
                    }
                    dVar2.a(i6, z);
                }
                i iVar2 = new i();
                iVar2.c = set;
                int iC = bVar.c();
                bVar.c();
                bVar.c();
                bVar.c();
                for (?? r11 = z; r11 < iC; r11++) {
                    String str = new String(bVar.a(4), StandardCharsets.ISO_8859_1);
                    com.microsoft.clarity.f.e cVar = str.equals("cmap") ? new com.microsoft.clarity.f.c() : str.equals("maxp") ? new com.microsoft.clarity.f.d() : new com.microsoft.clarity.f.e();
                    cVar.a = str;
                    bVar.b();
                    cVar.b = bVar.b();
                    long jB = bVar.b();
                    cVar.c = jB;
                    if (jB == j2 && !str.equals("glyf")) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        if ((cVar.b - j3) + cVar.c > i3) {
                            l.e("Skip table '" + cVar.a + "' which goes past the file size; offset: " + cVar.b + ", size: " + cVar.c + ", font size: " + i3);
                        } else {
                            iVar2.b.put(cVar.a, cVar);
                        }
                    }
                }
                arrayList2.add(iVar2);
                for (String str2 : this.a) {
                    long j5 = ((com.microsoft.clarity.f.e) iVar2.b.get(str2)).b;
                    long j6 = ((com.microsoft.clarity.f.e) iVar2.b.get(str2)).c;
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList = arrayList2;
                            bArr2 = null;
                            break;
                        }
                        a aVar2 = (a) it.next();
                        arrayList = arrayList2;
                        if (aVar2.a == j5 && aVar2.b == j6) {
                            bArr2 = aVar2.c;
                            break;
                        }
                        arrayList2 = arrayList;
                    }
                    if (bArr2 != null) {
                        iVar = iVar2;
                        c2 = c4;
                        aVar = null;
                    } else {
                        int i7 = (int) j6;
                        iVar = iVar2;
                        c2 = c4;
                        if (j6 != i7) {
                            throw new ArithmeticException();
                        }
                        aVar = new a(j5, j6, new byte[i7]);
                        arrayList3.add(aVar);
                    }
                    if (aVar != null) {
                        priorityQueue2.add(new f(aVar));
                        c4 = c2;
                        iVar2 = iVar;
                        arrayList2 = arrayList;
                    } else {
                        c4 = c2;
                        iVar2 = iVar;
                        arrayList2 = arrayList;
                    }
                }
                i3 = i2;
                c = c4;
                j = j2;
                priorityQueue = priorityQueue2;
                z = false;
            } else {
                byte[] bArr3 = ((f) eVar).a.c;
                bVar.a.a(bArr3, 0, bArr3.length, false);
                priorityQueue = priorityQueue2;
                z = false;
                j = j2;
                arrayList2 = arrayList2;
                i3 = i2;
            }
        }
        ArrayList<i> arrayList4 = arrayList2;
        boolean z2 = z;
        for (i iVar3 : arrayList4) {
            for (?? r3 = z2; r3 < this.a.size(); r3++) {
                com.microsoft.clarity.f.e eVar2 = (com.microsoft.clarity.f.e) iVar3.b.get(this.a.get(r3));
                long j7 = eVar2.b;
                long j8 = eVar2.c;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        bArr = null;
                        break;
                    }
                    a aVar3 = (a) it2.next();
                    if (aVar3.a == j7 && aVar3.b == j8) {
                        bArr = aVar3.c;
                        break;
                    }
                }
                if (bArr != null) {
                    eVar2.d = bArr;
                    eVar2.a(iVar3);
                }
            }
        }
        return arrayList4;
    }
}
