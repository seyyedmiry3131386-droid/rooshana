package com.google.gson.internal;

import defpackage.f84;
import defpackage.g84;
import defpackage.yg2;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final yg2 i = new yg2(24);
    public final Comparator a;
    public final boolean b;
    public g84 c;
    public int d;
    public int e;
    public final g84 f;
    public f84 g;
    public f84 h;

    public LinkedTreeMap() {
        this(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final g84 a(Object obj, boolean z) {
        int iCompareTo;
        g84 g84Var;
        g84 g84Var2 = this.c;
        yg2 yg2Var = i;
        Comparator comparator = this.a;
        if (g84Var2 != null) {
            Comparable comparable = comparator == yg2Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = g84Var2.f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return g84Var2;
                }
                g84 g84Var3 = iCompareTo < 0 ? g84Var2.b : g84Var2.c;
                if (g84Var3 == null) {
                    break;
                }
                g84Var2 = g84Var3;
            }
        } else {
            iCompareTo = 0;
        }
        g84 g84Var4 = g84Var2;
        if (!z) {
            return null;
        }
        g84 g84Var5 = this.f;
        if (g84Var4 != null) {
            g84Var = new g84(this.b, g84Var4, obj, g84Var5, g84Var5.e);
            if (iCompareTo < 0) {
                g84Var4.b = g84Var;
            } else {
                g84Var4.c = g84Var;
            }
            b(g84Var4, true);
        } else {
            if (comparator == yg2Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            g84Var = new g84(this.b, g84Var4, obj, g84Var5, g84Var5.e);
            this.c = g84Var;
        }
        this.d++;
        this.e++;
        return g84Var;
    }

    public final void b(g84 g84Var, boolean z) {
        while (g84Var != null) {
            g84 g84Var2 = g84Var.b;
            g84 g84Var3 = g84Var.c;
            int i2 = g84Var2 != null ? g84Var2.i : 0;
            int i3 = g84Var3 != null ? g84Var3.i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                g84 g84Var4 = g84Var3.b;
                g84 g84Var5 = g84Var3.c;
                int i5 = (g84Var4 != null ? g84Var4.i : 0) - (g84Var5 != null ? g84Var5.i : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    f(g84Var);
                } else {
                    g(g84Var3);
                    f(g84Var);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                g84 g84Var6 = g84Var2.b;
                g84 g84Var7 = g84Var2.c;
                int i6 = (g84Var6 != null ? g84Var6.i : 0) - (g84Var7 != null ? g84Var7.i : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    g(g84Var);
                } else {
                    f(g84Var2);
                    g(g84Var);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                g84Var.i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                g84Var.i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            g84Var = g84Var.a;
        }
    }

    public final void c(g84 g84Var, boolean z) {
        g84 g84Var2;
        g84 g84Var3;
        int i2;
        if (z) {
            g84 g84Var4 = g84Var.e;
            g84Var4.d = g84Var.d;
            g84Var.d.e = g84Var4;
        }
        g84 g84Var5 = g84Var.b;
        g84 g84Var6 = g84Var.c;
        g84 g84Var7 = g84Var.a;
        int i3 = 0;
        if (g84Var5 == null || g84Var6 == null) {
            if (g84Var5 != null) {
                e(g84Var, g84Var5);
                g84Var.b = null;
            } else if (g84Var6 != null) {
                e(g84Var, g84Var6);
                g84Var.c = null;
            } else {
                e(g84Var, null);
            }
            b(g84Var7, false);
            this.d--;
            this.e++;
            return;
        }
        if (g84Var5.i > g84Var6.i) {
            g84 g84Var8 = g84Var5.c;
            while (true) {
                g84 g84Var9 = g84Var8;
                g84Var3 = g84Var5;
                g84Var5 = g84Var9;
                if (g84Var5 == null) {
                    break;
                } else {
                    g84Var8 = g84Var5.c;
                }
            }
        } else {
            g84 g84Var10 = g84Var6.b;
            while (true) {
                g84Var2 = g84Var6;
                g84Var6 = g84Var10;
                if (g84Var6 == null) {
                    break;
                } else {
                    g84Var10 = g84Var6.b;
                }
            }
            g84Var3 = g84Var2;
        }
        c(g84Var3, false);
        g84 g84Var11 = g84Var.b;
        if (g84Var11 != null) {
            i2 = g84Var11.i;
            g84Var3.b = g84Var11;
            g84Var11.a = g84Var3;
            g84Var.b = null;
        } else {
            i2 = 0;
        }
        g84 g84Var12 = g84Var.c;
        if (g84Var12 != null) {
            i3 = g84Var12.i;
            g84Var3.c = g84Var12;
            g84Var12.a = g84Var3;
            g84Var.c = null;
        }
        g84Var3.i = Math.max(i2, i3) + 1;
        e(g84Var, g84Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = null;
        this.d = 0;
        this.e++;
        g84 g84Var = this.f;
        g84Var.e = g84Var;
        g84Var.d = g84Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        g84 g84VarA = null;
        if (obj != null) {
            try {
                g84VarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return g84VarA != null;
    }

    public final void e(g84 g84Var, g84 g84Var2) {
        g84 g84Var3 = g84Var.a;
        g84Var.a = null;
        if (g84Var2 != null) {
            g84Var2.a = g84Var3;
        }
        if (g84Var3 == null) {
            this.c = g84Var2;
        } else if (g84Var3.b == g84Var) {
            g84Var3.b = g84Var2;
        } else {
            g84Var3.c = g84Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        f84 f84Var = this.g;
        if (f84Var != null) {
            return f84Var;
        }
        f84 f84Var2 = new f84(this, 0);
        this.g = f84Var2;
        return f84Var2;
    }

    public final void f(g84 g84Var) {
        g84 g84Var2 = g84Var.b;
        g84 g84Var3 = g84Var.c;
        g84 g84Var4 = g84Var3.b;
        g84 g84Var5 = g84Var3.c;
        g84Var.c = g84Var4;
        if (g84Var4 != null) {
            g84Var4.a = g84Var;
        }
        e(g84Var, g84Var3);
        g84Var3.b = g84Var;
        g84Var.a = g84Var3;
        int iMax = Math.max(g84Var2 != null ? g84Var2.i : 0, g84Var4 != null ? g84Var4.i : 0) + 1;
        g84Var.i = iMax;
        g84Var3.i = Math.max(iMax, g84Var5 != null ? g84Var5.i : 0) + 1;
    }

    public final void g(g84 g84Var) {
        g84 g84Var2 = g84Var.b;
        g84 g84Var3 = g84Var.c;
        g84 g84Var4 = g84Var2.b;
        g84 g84Var5 = g84Var2.c;
        g84Var.b = g84Var5;
        if (g84Var5 != null) {
            g84Var5.a = g84Var;
        }
        e(g84Var, g84Var2);
        g84Var2.c = g84Var;
        g84Var.a = g84Var2;
        int iMax = Math.max(g84Var3 != null ? g84Var3.i : 0, g84Var5 != null ? g84Var5.i : 0) + 1;
        g84Var.i = iMax;
        g84Var2.i = Math.max(iMax, g84Var4 != null ? g84Var4.i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        g84 g84VarA;
        if (obj != null) {
            try {
                g84VarA = a(obj, false);
            } catch (ClassCastException unused) {
                g84VarA = null;
            }
        } else {
            g84VarA = null;
        }
        if (g84VarA != null) {
            return g84VarA.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        f84 f84Var = this.h;
        if (f84Var != null) {
            return f84Var;
        }
        f84 f84Var2 = new f84(this, 1);
        this.h = f84Var2;
        return f84Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        g84 g84VarA = a(obj, true);
        Object obj3 = g84VarA.h;
        g84VarA.h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g84 g84VarA;
        if (obj != null) {
            try {
                g84VarA = a(obj, false);
            } catch (ClassCastException unused) {
                g84VarA = null;
            }
        } else {
            g84VarA = null;
        }
        if (g84VarA != null) {
            c(g84VarA, true);
        }
        if (g84VarA != null) {
            return g84VarA.h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d;
    }

    public LinkedTreeMap(boolean z) {
        this.d = 0;
        this.e = 0;
        this.a = i;
        this.b = z;
        this.f = new g84(z);
    }
}
