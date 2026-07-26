package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import nene.downloadmanager.exceptions.NeneException;
import nene.downloadmanager.exceptions.NeneRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public final class fs1 {
    public static final int[] g;
    public final iu7 a;
    public final List b;
    public final List c;
    public final HashMap d;
    public final Map e;
    public final HashMap f;

    static {
        eh5.a("DownloadItemsHolder");
        g = new int[]{100, 110, 130, 120, 150, 140};
    }

    public fs1(iu7 iu7Var, List list, as1 as1Var) {
        this.a = iu7Var;
        if (list == null) {
            this.b = new ArrayList();
        } else {
            this.b = list;
        }
        ArrayList arrayList = new ArrayList();
        int i = this.b.size() == 0 ? 99 : Integer.MIN_VALUE;
        String strB = iu7Var.b();
        if (strB != null) {
            String[] strArrSplit = strB.equals("") ? new String[0] : strB.split(",");
            try {
                if (this.b.size() != strArrSplit.length) {
                    throw new NeneException("Download lists size don't match");
                }
                for (String str : strArrSplit) {
                    try {
                        int i2 = Integer.parseInt(str);
                        Iterator it = this.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                es1 es1Var = (es1) it.next();
                                if (es1Var.a == i2) {
                                    arrayList.add(es1Var);
                                    int i3 = es1Var.a;
                                    if (i3 > i) {
                                        i = i3;
                                    }
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                        throw new NeneException("NumberFormatException, id string = " + str);
                    }
                }
                if (this.b.size() != arrayList.size()) {
                    throw new NeneException("Didn't find id");
                }
                if (arrayList.size() > 1) {
                    ListIterator listIterator = arrayList.listIterator(0);
                    es1 es1Var2 = (es1) listIterator.next();
                    while (listIterator.hasNext()) {
                        es1 es1Var3 = (es1) listIterator.next();
                        if (b(es1Var2, es1Var3) > 0) {
                            es1Var2.toString();
                            es1Var3.toString();
                            throw new NeneException("Saved download order in not correct");
                        }
                        es1Var2 = es1Var3;
                    }
                }
                this.b = arrayList;
            } catch (NeneException unused2) {
                iu7Var.a(true);
                strB = null;
            }
        }
        if (strB == null) {
            ListIterator listIterator2 = this.b.listIterator(0);
            arrayList.clear();
            while (listIterator2.hasNext()) {
                es1 es1Var4 = (es1) listIterator2.next();
                listIterator2.remove();
                int i4 = es1Var4.a;
                i = i4 > i ? i4 : i;
                ListIterator listIterator3 = arrayList.listIterator(arrayList.size());
                listIterator3.hasNext();
                while (true) {
                    if (listIterator3.hasPrevious()) {
                        if (b(es1Var4, (es1) listIterator3.previous()) >= 0) {
                            listIterator3.next();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                listIterator3.add(es1Var4);
            }
            this.b = arrayList;
            h();
        }
        as1Var.a = i + 1;
        this.c = DesugarCollections.unmodifiableList(this.b);
        this.d = new HashMap();
        this.f = new HashMap();
        for (es1 es1Var5 : this.b) {
            this.d.put(Integer.valueOf(es1Var5.a), es1Var5);
            String str2 = es1Var5.d;
            if (str2 != null) {
                this.f.put(str2, es1Var5);
            }
        }
        this.e = DesugarCollections.unmodifiableMap(this.d);
        DesugarCollections.unmodifiableMap(this.f);
    }

    public static int b(es1 es1Var, es1 es1Var2) {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i2 != -1 && i3 != -1) {
                break;
            }
            int[] iArr = g;
            if (i >= iArr.length) {
                break;
            }
            int i4 = iArr[i];
            if (i4 == es1Var.f) {
                i2 = i;
            }
            if (i4 == es1Var2.f) {
                i3 = i;
            }
            i++;
        }
        return i2 - i3;
    }

    public final void a(es1 es1Var, int i) {
        if (i != 300) {
        }
        ListIterator listIterator = this.b.listIterator(0);
        while (listIterator.hasNext()) {
            int iB = b(es1Var, (es1) listIterator.next());
            if (iB < 0 || (iB == 0 && i == 300)) {
                listIterator.previous();
                break;
            }
        }
        listIterator.add(es1Var);
        this.d.put(Integer.valueOf(es1Var.a), es1Var);
        String str = es1Var.d;
        if (str != null) {
            this.f.put(str, es1Var);
        }
        h();
    }

    public final boolean c(es1 es1Var) {
        es1 es1Var2;
        int iB;
        ListIterator listIteratorE = e(es1Var);
        if (!listIteratorE.hasNext() || (iB = b(es1Var, (es1Var2 = (es1) listIteratorE.next()))) < 0) {
            return false;
        }
        if (iB != 0) {
            return true;
        }
        listIteratorE.remove();
        listIteratorE.previous();
        listIteratorE.add(es1Var2);
        h();
        return true;
    }

    public final es1 d(int i) {
        return (es1) this.d.get(Integer.valueOf(i));
    }

    public final ListIterator e(es1 es1Var) {
        ListIterator listIterator = this.b.listIterator(0);
        while (listIterator.hasNext()) {
            if (((es1) listIterator.next()) == es1Var) {
                return listIterator;
            }
        }
        throw new NeneRuntimeException("Download item does not exits in downloadItems list");
    }

    public final List f() {
        if (this.b.isEmpty() || ((es1) this.b.get(0)).f != 100) {
            return Collections.EMPTY_LIST;
        }
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext() && ((es1) it.next()).f == 100) {
            i++;
        }
        return this.b.subList(0, i);
    }

    public final void g(es1 es1Var, int i) {
        ListIterator listIteratorE = e(es1Var);
        listIteratorE.previous();
        listIteratorE.remove();
        a(es1Var, i);
    }

    public final void h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(((es1) it.next()).a);
            sb.append(",");
        }
        this.a.c(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Download Items  (");
        sb.append(this.b.size());
        sb.append(")\n");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(((es1) it.next()).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
