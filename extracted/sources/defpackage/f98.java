package defpackage;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.sun.jna.Callback;
import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f98 {
    public static final int ALIGN_DEFAULT = 0;
    public static final int ALIGN_GNUC = 2;
    public static final int ALIGN_MSVC = 3;
    public static final int ALIGN_NONE = 1;
    protected static final int CALCULATE_SIZE = -1;
    private int actualAlignType;
    private int alignType;
    private f98[] array;
    private boolean autoRead;
    private boolean autoWrite;
    private String encoding;
    private Pointer memory;
    private final Map<String, Object> nativeStrings;
    private boolean readCalled;
    private int size;
    private int structAlignment;
    private Map<String, d98> structFields;
    private long typeInfo;
    private xu8 typeMapper;
    private static final Logger LOG = Logger.getLogger(f98.class.getName());
    static final Map<Class<?>, c98> layoutInfo = new WeakHashMap();
    static final Map<Class<?>, List<String>> fieldOrder = new WeakHashMap();
    private static final ThreadLocal<Map<Pointer, f98>> reads = new mi(6);
    private static final ThreadLocal<Set<f98>> busy = new mi(7);
    private static final Pointer PLACEHOLDER_MEMORY = new w88(0);

    public f98() {
        this(null, 0);
    }

    public static void autoRead(f98[] f98VarArr) {
        d(f98VarArr);
        f98 f98Var = f98VarArr[0];
        if (f98Var.array == f98VarArr) {
            f98Var.autoRead();
            return;
        }
        for (f98 f98Var2 : f98VarArr) {
            if (f98Var2 != null) {
                f98Var2.autoRead();
            }
        }
    }

    public static void autoWrite(f98[] f98VarArr) {
        d(f98VarArr);
        f98 f98Var = f98VarArr[0];
        if (f98Var.array == f98VarArr) {
            f98Var.autoWrite();
            return;
        }
        for (f98 f98Var2 : f98VarArr) {
            if (f98Var2 != null) {
                f98Var2.autoWrite();
            }
        }
    }

    public static Set<f98> busy() {
        return busy.get();
    }

    public static List<String> createFieldsOrder(List<String> list, String... strArr) {
        return createFieldsOrder(list, (List<String>) Arrays.asList(strArr));
    }

    public static void d(f98[] f98VarArr) {
        if (y88[].class.isAssignableFrom(f98VarArr.getClass())) {
            return;
        }
        Pointer pointer = f98VarArr[0].getPointer();
        int size = f98VarArr[0].size();
        for (int i = 1; i < f98VarArr.length; i++) {
            if (f98VarArr[i].getPointer().a != pointer.a + ((long) (size * i))) {
                throw new IllegalArgumentException(bl4.q(i, "Structure array elements must use contiguous memory (bad backing address at Structure array index ", ")"));
            }
        }
    }

    public static <T extends f98> T newInstance(Class<T> cls, Pointer pointer) throws IllegalArgumentException {
        try {
            return cls.getConstructor(Pointer.class).newInstance(pointer);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(bl4.t(cls, "Instantiation of ", " (Pointer) not allowed, is it public?"), e);
        } catch (InstantiationException e2) {
            throw new IllegalArgumentException(bl4.v("Can't instantiate ", cls), e2);
        } catch (NoSuchMethodException | SecurityException unused) {
            T t = (T) newInstance(cls);
            if (pointer != PLACEHOLDER_MEMORY) {
                t.useMemory(pointer);
            }
            return t;
        } catch (InvocationTargetException e3) {
            throw new IllegalArgumentException(bl4.v("Exception thrown while instantiating an instance of ", cls), e3);
        }
    }

    public static Map<Pointer, f98> reading() {
        return reads.get();
    }

    public static <T extends f98> T updateStructureByReference(Class<T> cls, T t, Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        if (t != null && pointer.equals(t.getPointer())) {
            t.autoRead();
            return t;
        }
        T t2 = (T) reading().get(pointer);
        if (t2 != null && cls.equals(t2.getClass())) {
            t2.autoRead();
            return t2;
        }
        T t3 = (T) newInstance(cls, pointer);
        t3.conditionalAutoRead();
        return t3;
    }

    public static void validate(Class<? extends f98> cls) {
        try {
            cls.getConstructor(null);
        } catch (NoSuchMethodException | SecurityException unused) {
            throw new IllegalArgumentException("No suitable constructor found for class: ".concat(cls.getName()));
        }
    }

    public final void a(boolean z) {
        if (this.memory == null) {
            allocateMemory(calculateSize(true, z));
            return;
        }
        if (this.size == -1) {
            int iCalculateSize = calculateSize(true, z);
            this.size = iCalculateSize;
            Pointer pointer = this.memory;
            if (pointer instanceof x88) {
                return;
            }
            try {
                this.memory = pointer.F(0L, iCalculateSize);
            } catch (IndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Structure exceeds provided memory bounds", e);
            }
        }
    }

    public void allocateMemory() {
        allocateMemory(calculateSize(true, false));
    }

    public gt4 autoAllocate(int i) {
        x88 x88Var = new x88(i);
        Native.setMemory(x88Var, x88Var.a, 0L, x88Var.b, (byte) 0);
        return x88Var;
    }

    public final Object b(Class cls, Field field) {
        if (!f98.class.isAssignableFrom(cls) || y88.class.isAssignableFrom(cls)) {
            if (!vh5.class.isAssignableFrom(cls)) {
                return null;
            }
            vh5 vh5VarA = wh5.b(cls).a();
            setFieldValue(field, vh5VarA);
            return vh5VarA;
        }
        try {
            f98 f98VarNewInstance = newInstance(cls, PLACEHOLDER_MEMORY);
            setFieldValue(field, f98VarNewInstance);
            return f98VarNewInstance;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Can't determine size of nested structure", e);
        }
    }

    public final void c(Field field, Object obj, boolean z) {
        try {
            field.set(this, obj);
        } catch (IllegalAccessException e) {
            if (!Modifier.isFinal(field.getModifiers())) {
                throw new Error("Unexpectedly unable to write to field '" + field.getName() + "' within " + getClass(), e);
            }
            if (!z) {
                throw new UnsupportedOperationException("Attempt to write to read-only field '" + field.getName() + "' within " + getClass(), e);
            }
            throw new UnsupportedOperationException("This VM does not support Structures with final fields (field '" + field.getName() + "' within " + getClass() + ")", e);
        }
    }

    public void cacheTypeInfo(Pointer pointer) {
        this.typeInfo = pointer.a;
    }

    public int calculateSize(boolean z) {
        return calculateSize(z, false);
    }

    public void clear() {
        ensureAllocated();
        Pointer pointer = this.memory;
        Native.setMemory(pointer, pointer.a, 0L, size(), (byte) 0);
    }

    public void conditionalAutoRead() {
        if (this.readCalled) {
            return;
        }
        autoRead();
    }

    public boolean dataEquals(f98 f98Var) {
        return dataEquals(f98Var, false);
    }

    public final String e(int i, boolean z, boolean z2) {
        String strI;
        String str;
        String string;
        ensureAllocated();
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        String name = getClass().getName();
        int i2 = 1;
        sb.append(name.substring(name.lastIndexOf(".") + 1));
        sb.append("(");
        sb.append(getPointer());
        sb.append(")");
        String string2 = sb.toString();
        if (!(getPointer() instanceof gt4)) {
            StringBuilder sbE = bl4.E(string2, " (");
            sbE.append(size());
            sbE.append(" bytes)");
            string2 = sbE.toString();
        }
        String strI2 = "";
        for (int i3 = 0; i3 < i; i3++) {
            strI2 = t61.i(strI2, "  ");
        }
        if (z) {
            Iterator<d98> it = fields().values().iterator();
            String str2 = property;
            while (it.hasNext()) {
                d98 next = it.next();
                Object fieldValue = getFieldValue(next.c);
                String name2 = next.b.getName();
                int i4 = i2;
                String strSubstring = name2.substring(name2.lastIndexOf(".") + 1);
                String strI3 = t61.i(str2, strI2);
                if (!next.b.isArray() || fieldValue == null) {
                    str = "";
                } else {
                    String name3 = next.b.getComponentType().getName();
                    strSubstring = name3.substring(name3.lastIndexOf(".") + 1);
                    str = "[" + Array.getLength(fieldValue) + "]";
                }
                StringBuilder sbC = bl4.C(strI3);
                String str3 = next.a;
                Integer numValueOf = Integer.valueOf(next.e);
                String str4 = str;
                Object[] objArr = new Object[4];
                objArr[0] = strSubstring;
                objArr[i4] = str3;
                objArr[2] = str4;
                objArr[3] = numValueOf;
                sbC.append(String.format("  %s %s%s@0x%X", objArr));
                String string3 = sbC.toString();
                if (fieldValue instanceof f98) {
                    fieldValue = ((f98) fieldValue).e(i + 1, !(fieldValue instanceof y88), z2);
                }
                String strI4 = t61.i(string3, SimpleComparison.EQUAL_TO_OPERATION);
                if (fieldValue instanceof Long) {
                    StringBuilder sbC2 = bl4.C(strI4);
                    i2 = i4;
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = (Long) fieldValue;
                    sbC2.append(String.format("0x%08X", objArr2));
                    string = sbC2.toString();
                } else {
                    i2 = i4;
                    if (fieldValue instanceof Integer) {
                        StringBuilder sbC3 = bl4.C(strI4);
                        Object[] objArr3 = new Object[i2];
                        objArr3[0] = (Integer) fieldValue;
                        sbC3.append(String.format("0x%04X", objArr3));
                        string = sbC3.toString();
                    } else if (fieldValue instanceof Short) {
                        StringBuilder sbC4 = bl4.C(strI4);
                        Object[] objArr4 = new Object[i2];
                        objArr4[0] = (Short) fieldValue;
                        sbC4.append(String.format("0x%02X", objArr4));
                        string = sbC4.toString();
                    } else if (fieldValue instanceof Byte) {
                        StringBuilder sbC5 = bl4.C(strI4);
                        Object[] objArr5 = new Object[i2];
                        objArr5[0] = (Byte) fieldValue;
                        sbC5.append(String.format("0x%01X", objArr5));
                        string = sbC5.toString();
                    } else {
                        StringBuilder sbC6 = bl4.C(strI4);
                        sbC6.append(String.valueOf(fieldValue).trim());
                        string = sbC6.toString();
                    }
                }
                String strI5 = t61.i(string, property);
                if (!it.hasNext()) {
                    strI5 = t61.j(strI5, strI2, "}");
                }
                str2 = strI5;
            }
            strI = str2;
        } else {
            strI = "...}";
        }
        int i5 = 3;
        if (i == 0 && z2) {
            String strQ = rm7.q(strI, property, "memory dump", property);
            Pointer pointer = getPointer();
            int size = size();
            pointer.getClass();
            byte[] bArr = new byte[size];
            pointer.m(size, 0L, bArr);
            int i6 = 0;
            while (i6 < size) {
                int i7 = i6 % 4;
                if (i7 == 0) {
                    strQ = t61.i(strQ, "[");
                }
                byte b = bArr[i6];
                if (b >= 0 && b < 16) {
                    strQ = t61.i(strQ, "0");
                }
                StringBuilder sbC7 = bl4.C(strQ);
                sbC7.append(Integer.toHexString(bArr[i6] & 255));
                strQ = sbC7.toString();
                int i8 = i5;
                if (i7 == i8 && i6 < size - 1) {
                    strQ = t61.j(strQ, "]", property);
                }
                i6++;
                i5 = i8;
            }
            strI = t61.i(strQ, "]");
        }
        return t61.j(string2, " {", strI);
    }

    public void ensureAllocated() {
        a(false);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f98) && obj.getClass() == getClass() && ((f98) obj).getPointer().equals(getPointer());
    }

    public final void f(String str, Class cls) {
        if (cls.isArray()) {
            f(str, cls.getComponentType());
            return;
        }
        try {
            getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid Structure field in " + getClass() + ", field name '" + str + "' (" + cls + "): " + e.getMessage(), e);
        }
    }

    public int fieldOffset(String str) {
        ensureAllocated();
        d98 d98Var = fields().get(str);
        if (d98Var != null) {
            return d98Var.e;
        }
        throw new IllegalArgumentException(dw1.n("No such field: ", str));
    }

    public Map<String, d98> fields() {
        return this.structFields;
    }

    public boolean getAutoRead() {
        return this.autoRead;
    }

    public boolean getAutoWrite() {
        return this.autoWrite;
    }

    public List<Field> getFieldList() {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = getClass(); !superclass.equals(f98.class); superclass = superclass.getSuperclass()) {
            ArrayList arrayList2 = new ArrayList();
            Field[] declaredFields = superclass.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; i++) {
                int modifiers = declaredFields[i].getModifiers();
                if (!Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                    arrayList2.add(declaredFields[i]);
                }
            }
            arrayList.addAll(0, arrayList2);
        }
        return arrayList;
    }

    public List getFieldOrder() {
        LinkedList linkedList = new LinkedList();
        for (Class<?> superclass = getClass(); superclass != f98.class; superclass = superclass.getSuperclass()) {
            b98 b98Var = (b98) superclass.getAnnotation(b98.class);
            if (b98Var != null) {
                linkedList.addAll(0, Arrays.asList(b98Var.value()));
            }
        }
        return DesugarCollections.unmodifiableList(linkedList);
    }

    public Pointer getFieldTypeInfo(d98 d98Var) {
        return a98.g(d98Var.b, getFieldValue(d98Var.c));
    }

    public Object getFieldValue(Field field) {
        try {
            return field.get(this);
        } catch (Exception e) {
            throw new Error("Exception reading field '" + field.getName() + "' in " + getClass(), e);
        }
    }

    public List<Field> getFields(boolean z) {
        List<String> fieldOrder2;
        List<Field> fieldList = getFieldList();
        HashSet hashSet = new HashSet();
        Iterator<Field> it = fieldList.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getName());
        }
        Class<?> cls = getClass();
        Map<Class<?>, List<String>> map = fieldOrder;
        synchronized (map) {
            try {
                fieldOrder2 = map.get(cls);
                if (fieldOrder2 == null) {
                    fieldOrder2 = getFieldOrder();
                    map.put(cls, fieldOrder2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fieldOrder2.size() == fieldList.size() || fieldList.size() <= 1) {
            if (new HashSet(fieldOrder2).equals(hashSet)) {
                sortFields(fieldList, fieldOrder2);
                return fieldList;
            }
            StringBuilder sb = new StringBuilder("Structure.getFieldOrder() on ");
            sb.append(getClass());
            sb.append(" returns names (");
            ArrayList arrayList = new ArrayList(fieldOrder2);
            Collections.sort(arrayList);
            sb.append(arrayList);
            sb.append(") which do not match declared field names (");
            ArrayList arrayList2 = new ArrayList(hashSet);
            Collections.sort(arrayList2);
            sb.append(arrayList2);
            sb.append(")");
            throw new Error(sb.toString());
        }
        if (!z) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Structure.getFieldOrder() on ");
        sb2.append(getClass());
        sb2.append(fieldOrder2.size() < fieldList.size() ? " does not provide enough" : " provides too many");
        sb2.append(" names [");
        sb2.append(fieldOrder2.size());
        sb2.append("] (");
        ArrayList arrayList3 = new ArrayList(fieldOrder2);
        Collections.sort(arrayList3);
        sb2.append(arrayList3);
        sb2.append(") to match declared fields [");
        sb2.append(fieldList.size());
        sb2.append("] (");
        ArrayList arrayList4 = new ArrayList(hashSet);
        Collections.sort(arrayList4);
        sb2.append(arrayList4);
        sb2.append(")");
        throw new Error(sb2.toString());
    }

    public int getNativeAlignment(Class<?> cls, Object obj, boolean z) {
        if (vh5.class.isAssignableFrom(cls)) {
            wh5 wh5VarB = wh5.b(cls);
            Class<?> cls2 = wh5VarB.b;
            if (obj != null) {
                obj = ((vh5) obj).a();
                cls = cls2;
            } else if (Pointer.class.isAssignableFrom(cls2)) {
                obj = null;
                cls = cls2;
            } else {
                obj = wh5VarB.a();
                obj = ((vh5) obj).a();
                cls = cls2;
            }
        }
        int iK = Native.k(cls, obj);
        if (!cls.isPrimitive() && Long.class != cls && Integer.class != cls && Short.class != cls && Character.class != cls && Byte.class != cls && Boolean.class != cls && Float.class != cls && Double.class != cls) {
            if ((Pointer.class.isAssignableFrom(cls) && !Function.class.isAssignableFrom(cls)) || ((m96.b && Buffer.class.isAssignableFrom(cls)) || Callback.class.isAssignableFrom(cls) || fc9.class == cls || String.class == cls)) {
                iK = Native.i;
            } else if (f98.class.isAssignableFrom(cls)) {
                if (y88.class.isAssignableFrom(cls)) {
                    iK = Native.i;
                } else {
                    if (obj == null) {
                        obj = newInstance(cls, PLACEHOLDER_MEMORY);
                    }
                    iK = ((f98) obj).getStructAlignment();
                }
            } else {
                if (!cls.isArray()) {
                    throw new IllegalArgumentException(bl4.t(cls, "Type ", " has unknown native alignment"));
                }
                iK = getNativeAlignment(cls.getComponentType(), null, z);
            }
        }
        int i = this.actualAlignType;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return Math.min(8, iK);
        }
        if (i == 2) {
            if (!z || !m96.f() || !m96.g()) {
                iK = Math.min(Native.l, iK);
            }
            if (!z && m96.c() && (cls == Double.TYPE || cls == Double.class)) {
                return 4;
            }
        }
        return iK;
    }

    public int getNativeSize(Class<?> cls) {
        return getNativeSize(cls, null);
    }

    public Pointer getPointer() {
        ensureAllocated();
        return this.memory;
    }

    public String getStringEncoding() {
        return this.encoding;
    }

    public int getStructAlignment() {
        if (this.size == -1) {
            calculateSize(true);
        }
        return this.structAlignment;
    }

    public Pointer getTypeInfo() {
        Pointer typeInfo = getTypeInfo(this);
        cacheTypeInfo(typeInfo);
        return typeInfo;
    }

    public xu8 getTypeMapper() {
        return null;
    }

    public int hashCode() {
        return getPointer() != null ? getPointer().hashCode() : getClass().hashCode();
    }

    public void read() {
        if (this.memory == PLACEHOLDER_MEMORY) {
            return;
        }
        this.readCalled = true;
        ensureAllocated();
        if (busy().contains(this)) {
            return;
        }
        busy().add(this);
        if (this instanceof y88) {
            reading().put(getPointer(), this);
        }
        try {
            Iterator<d98> it = fields().values().iterator();
            while (it.hasNext()) {
                readField(it.next());
            }
        } finally {
            busy().remove(this);
            if (reading().get(getPointer()) == this) {
                reading().remove(getPointer());
            }
        }
    }

    public Object readField(String str) {
        ensureAllocated();
        d98 d98Var = fields().get(str);
        if (d98Var != null) {
            return readField(d98Var);
        }
        throw new IllegalArgumentException(dw1.n("No such field: ", str));
    }

    public void setAlignType(int i) {
        this.alignType = i;
        if (i == 0) {
            Integer num = (Integer) Native.i(getClass()).get("structure-alignment");
            i = num == null ? 0 : num.intValue();
            if (i == 0) {
                i = m96.h() ? 3 : 2;
            }
        }
        this.actualAlignType = i;
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof x88) {
                this.memory = null;
            }
            ensureAllocated();
        }
    }

    public void setAutoRead(boolean z) {
        this.autoRead = z;
    }

    public void setAutoSynch(boolean z) {
        setAutoRead(z);
        setAutoWrite(z);
    }

    public void setAutoWrite(boolean z) {
        this.autoWrite = z;
    }

    public void setFieldValue(Field field, Object obj) {
        c(field, obj, false);
    }

    public void setStringEncoding(String str) {
        this.encoding = str;
    }

    public int size() {
        ensureAllocated();
        return this.size;
    }

    public void sortFields(List<Field> list, List<String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            String str = list2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (str.equals(list.get(i2).getName())) {
                    Collections.swap(list, i, i2);
                    break;
                }
                i2++;
            }
        }
    }

    public f98[] toArray(f98[] f98VarArr) {
        ensureAllocated();
        Pointer pointer = this.memory;
        if (pointer instanceof x88) {
            int size = size() * f98VarArr.length;
            if (((gt4) pointer).b < size) {
                useMemory(autoAllocate(size));
            }
        }
        f98VarArr[0] = this;
        int size2 = size();
        for (int i = 1; i < f98VarArr.length; i++) {
            f98 f98VarNewInstance = newInstance(getClass(), this.memory.F(i * size2, size2));
            f98VarArr[i] = f98VarNewInstance;
            f98VarNewInstance.conditionalAutoRead();
        }
        this.array = f98VarArr;
        return f98VarArr;
    }

    public String toString() {
        return toString(Boolean.getBoolean("jna.dump_memory"));
    }

    public d98 typeInfoField() {
        c98 c98Var;
        Map<Class<?>, c98> map = layoutInfo;
        synchronized (map) {
            c98Var = map.get(getClass());
        }
        if (c98Var != null) {
            return c98Var.f;
        }
        return null;
    }

    public void useMemory(Pointer pointer) {
        useMemory(pointer, 0);
    }

    public void write() {
        if (this.memory == PLACEHOLDER_MEMORY) {
            return;
        }
        ensureAllocated();
        if (busy().contains(this)) {
            return;
        }
        busy().add(this);
        try {
            for (d98 d98Var : fields().values()) {
                if (!d98Var.f) {
                    writeField(d98Var);
                }
            }
        } finally {
            busy().remove(this);
        }
    }

    public void writeField(String str) {
        ensureAllocated();
        d98 d98Var = fields().get(str);
        if (d98Var == null) {
            throw new IllegalArgumentException(dw1.n("No such field: ", str));
        }
        writeField(d98Var);
    }

    public f98(Pointer pointer, int i) {
        this.size = -1;
        this.nativeStrings = new HashMap();
        this.autoRead = true;
        this.autoWrite = true;
        setAlignType(0);
        String str = (String) Native.i(getClass()).get("string-encoding");
        setStringEncoding(str == null ? Native.g() : str);
        if (Native.i(getClass()).get("type-mapper") != null) {
            throw new ClassCastException();
        }
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof x88) {
                this.memory = null;
            }
            ensureAllocated();
        }
        for (Field field : getFieldList()) {
            f(field.getName(), field.getType());
        }
        if (pointer != null) {
            useMemory(pointer, 0, true);
        } else {
            allocateMemory(-1);
        }
        for (Field field2 : getFieldList()) {
            try {
                if (field2.get(this) == null) {
                    b(field2.getType(), field2);
                }
            } catch (Exception e) {
                throw new Error("Exception reading field '" + field2.getName() + "' in " + getClass(), e);
            }
        }
    }

    public static List<String> createFieldsOrder(List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void allocateMemory(int i) {
        if (i == -1) {
            i = calculateSize(false);
        } else if (i <= 0) {
            throw new IllegalArgumentException(rm7.n(i, "Structure size must be greater than zero: "));
        }
        if (i != -1) {
            Pointer pointer = this.memory;
            if (pointer == null || (pointer instanceof x88)) {
                this.memory = autoAllocate(i);
            }
            this.size = i;
        }
    }

    public int calculateSize(boolean z, boolean z2) {
        c98 c98Var;
        int i;
        Class<?> cls;
        int i2;
        int i3;
        Class<?> cls2 = getClass();
        Map<Class<?>, c98> map = layoutInfo;
        synchronized (map) {
            c98Var = map.get(cls2);
        }
        int i4 = -1;
        if (c98Var == null || this.alignType != c98Var.d) {
            List<Field> fields = getFields(z);
            if (fields == null) {
                c98Var = null;
            } else {
                c98 c98Var2 = new c98();
                c98Var2.d = this.alignType;
                boolean z3 = true;
                int i5 = 0;
                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    Class<?> type = field.getType();
                    if (type.isArray()) {
                        c98Var2.e = true;
                    }
                    d98 d98Var = new d98();
                    d98Var.d = i4;
                    d98Var.e = i4;
                    d98Var.f = Modifier.isVolatile(modifiers);
                    boolean zIsFinal = Modifier.isFinal(modifiers);
                    d98Var.g = zIsFinal;
                    if (zIsFinal) {
                        if (!m96.a) {
                            throw new IllegalArgumentException("This VM does not support read-only fields (field '" + field.getName() + "' within " + getClass() + ")");
                        }
                        field.setAccessible(true);
                    }
                    d98Var.c = field;
                    d98Var.a = field.getName();
                    d98Var.b = type;
                    if (Callback.class.isAssignableFrom(type) && !type.isInterface()) {
                        throw new IllegalArgumentException("Structure Callback field '" + field.getName() + "' must be an interface");
                    }
                    if (type.isArray() && f98.class.equals(type.getComponentType())) {
                        throw new IllegalArgumentException("Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined");
                    }
                    if (Modifier.isPublic(field.getModifiers())) {
                        Object fieldValue = getFieldValue(d98Var.c);
                        if (fieldValue != null || !type.isArray()) {
                            if (vh5.class.isAssignableFrom(type)) {
                                wh5 wh5VarB = wh5.b(type);
                                cls = wh5VarB.b;
                                d98Var.i = wh5VarB;
                                d98Var.h = wh5VarB;
                                field.getType();
                            } else {
                                cls = type;
                            }
                            if (fieldValue == null) {
                                fieldValue = b(type, d98Var.c);
                            }
                            try {
                                d98Var.d = getNativeSize(cls, fieldValue);
                                int nativeAlignment = getNativeAlignment(cls, fieldValue, z3);
                                if (nativeAlignment == 0) {
                                    throw new Error("Field alignment is zero for field '" + d98Var.a + "' within " + getClass());
                                }
                                c98Var2.b = Math.max(c98Var2.b, nativeAlignment);
                                int i6 = i5 % nativeAlignment;
                                if (i6 != 0) {
                                    i5 += nativeAlignment - i6;
                                }
                                d98Var.e = i5;
                                i5 += d98Var.d;
                                c98Var2.c.put(d98Var.a, d98Var);
                                d98 d98Var2 = c98Var2.f;
                                if (d98Var2 == null || (i2 = d98Var2.d) < (i3 = d98Var.d) || (i2 == i3 && f98.class.isAssignableFrom(d98Var.b))) {
                                    c98Var2.f = d98Var;
                                }
                            } catch (IllegalArgumentException e) {
                                if (z) {
                                    throw new IllegalArgumentException("Invalid Structure field in " + getClass() + ", field name '" + d98Var.a + "' (" + d98Var.b + "): " + e.getMessage(), e);
                                }
                            }
                        } else if (z) {
                            throw new IllegalStateException("Array fields must be initialized");
                        }
                        c98Var = null;
                    }
                    z3 = false;
                    i4 = -1;
                }
                if (i5 <= 0) {
                    throw new IllegalArgumentException("Structure " + getClass() + " has unknown or zero size (ensure all fields are public)");
                }
                int i7 = c98Var2.b;
                if (this.actualAlignType != 1 && (i = i5 % i7) != 0) {
                    i5 += i7 - i;
                }
                c98Var2.a = i5;
                c98Var = c98Var2;
            }
        }
        if (c98Var == null) {
            return -1;
        }
        this.structAlignment = c98Var.b;
        this.structFields = c98Var.c;
        if (!c98Var.e) {
            Map<Class<?>, c98> map2 = layoutInfo;
            synchronized (map2) {
                try {
                    if (!map2.containsKey(cls2) || this.alignType != 0) {
                        map2.put(cls2, c98Var);
                    }
                } finally {
                }
            }
        }
        return c98Var.a;
    }

    public boolean dataEquals(f98 f98Var, boolean z) {
        if (z) {
            Pointer pointer = f98Var.getPointer();
            Native.setMemory(pointer, pointer.a, 0L, f98Var.size(), (byte) 0);
            f98Var.write();
            Pointer pointer2 = getPointer();
            Native.setMemory(pointer2, pointer2.a, 0L, size(), (byte) 0);
            write();
        }
        Pointer pointer3 = f98Var.getPointer();
        int size = f98Var.size();
        pointer3.getClass();
        byte[] bArr = new byte[size];
        pointer3.m(size, 0L, bArr);
        Pointer pointer4 = getPointer();
        int size2 = size();
        pointer4.getClass();
        byte[] bArr2 = new byte[size2];
        pointer4.m(size2, 0L, bArr2);
        if (size != size2) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int getNativeSize(Class<?> cls, Object obj) {
        return Native.k(cls, obj);
    }

    public String toString(boolean z) {
        return e(0, true, z);
    }

    public void useMemory(Pointer pointer, int i) {
        useMemory(pointer, i, false);
    }

    public static Pointer getTypeInfo(Object obj) {
        return a98.h(obj);
    }

    public static int size(Class<? extends f98> cls) {
        return size(cls, null);
    }

    public void useMemory(Pointer pointer, int i, boolean z) {
        try {
            this.nativeStrings.clear();
            long j = i;
            this.memory = pointer.E(j);
            if (this.size == -1) {
                this.size = calculateSize(false);
            }
            int i2 = this.size;
            if (i2 != -1) {
                this.memory = pointer.F(j, i2);
            }
            this.array = null;
            this.readCalled = false;
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Structure exceeds provided memory bounds", e);
        }
    }

    public static <T extends f98> int size(Class<T> cls, T t) {
        c98 c98Var;
        Map<Class<?>, c98> map = layoutInfo;
        synchronized (map) {
            c98Var = map.get(cls);
        }
        int i = (c98Var == null || c98Var.e) ? -1 : c98Var.a;
        if (i != -1) {
            return i;
        }
        if (t == null) {
            t = (T) newInstance(cls, PLACEHOLDER_MEMORY);
        }
        return t.size();
    }

    public static List<String> createFieldsOrder(String str) {
        return DesugarCollections.unmodifiableList(Collections.singletonList(str));
    }

    public static List<String> createFieldsOrder(String... strArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList(strArr));
    }

    public void autoRead() {
        if (!getAutoRead()) {
            return;
        }
        read();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            f98[] f98VarArr = this.array;
            if (i >= f98VarArr.length) {
                return;
            }
            f98VarArr[i].autoRead();
            i++;
        }
    }

    public void autoWrite() {
        if (!getAutoWrite()) {
            return;
        }
        write();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            f98[] f98VarArr = this.array;
            if (i >= f98VarArr.length) {
                return;
            }
            f98VarArr[i].autoWrite();
            i++;
        }
    }

    public Object readField(d98 d98Var) {
        int i = d98Var.e;
        Class cls = d98Var.b;
        wh5 wh5Var = d98Var.h;
        if (wh5Var != null) {
            cls = wh5Var.b;
        }
        Object objK = null;
        Object fieldValue = (f98.class.isAssignableFrom(cls) || Callback.class.isAssignableFrom(cls) || (m96.b && Buffer.class.isAssignableFrom(cls)) || Pointer.class.isAssignableFrom(cls) || vh5.class.isAssignableFrom(cls) || cls.isArray()) ? getFieldValue(d98Var.c) : null;
        if (cls == String.class) {
            Pointer pointerG = this.memory.g(i);
            if (pointerG != null) {
                objK = pointerG.i(this.encoding);
            }
        } else {
            objK = this.memory.k(i, cls, fieldValue);
        }
        if (wh5Var != null) {
            Object objB = wh5Var.c.b(objK);
            if (fieldValue == null || !fieldValue.equals(objB)) {
                fieldValue = objB;
            }
        } else {
            fieldValue = objK;
        }
        if (cls.equals(String.class) || cls.equals(fc9.class)) {
            this.nativeStrings.put(dw1.s(new StringBuilder(), d98Var.a, ".ptr"), this.memory.g(i));
            this.nativeStrings.put(d98Var.a + ".val", fieldValue);
        }
        c(d98Var.c, fieldValue, true);
        return fieldValue;
    }

    public void writeField(String str, Object obj) {
        ensureAllocated();
        d98 d98Var = fields().get(str);
        if (d98Var != null) {
            setFieldValue(d98Var.c, obj);
            writeField(d98Var);
            return;
        }
        throw new IllegalArgumentException(dw1.n("No such field: ", str));
    }

    public f98[] toArray(int i) {
        return toArray((f98[]) Array.newInstance(getClass(), i));
    }

    public void writeField(d98 d98Var) {
        xh5 xh5Var;
        if (d98Var.g) {
            return;
        }
        int i = d98Var.e;
        Object fieldValue = getFieldValue(d98Var.c);
        Class cls = d98Var.b;
        wh5 wh5Var = d98Var.i;
        if (wh5Var != null) {
            cls = wh5Var.b;
            if (fieldValue == null) {
                if (Pointer.class.isAssignableFrom(cls)) {
                    fieldValue = null;
                } else {
                    fieldValue = wh5Var.a();
                    fieldValue = ((vh5) fieldValue).a();
                }
            } else {
                fieldValue = ((vh5) fieldValue).a();
            }
        }
        if (String.class == cls || fc9.class == cls) {
            boolean z = cls == fc9.class;
            if (fieldValue != null) {
                if (this.nativeStrings.containsKey(d98Var.a + ".ptr")) {
                    if (fieldValue.equals(this.nativeStrings.get(d98Var.a + ".val"))) {
                        return;
                    }
                }
                if (z) {
                    xh5Var = new xh5(fieldValue.toString(), true);
                } else {
                    xh5Var = new xh5(fieldValue.toString(), this.encoding);
                }
                this.nativeStrings.put(d98Var.a, xh5Var);
                fieldValue = xh5Var.a;
            } else {
                this.nativeStrings.remove(d98Var.a);
            }
            this.nativeStrings.remove(d98Var.a + ".ptr");
            this.nativeStrings.remove(d98Var.a + ".val");
        }
        try {
            this.memory.C(i, cls, fieldValue);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Structure field \"");
            sb.append(d98Var.a);
            sb.append("\" was declared as ");
            sb.append(d98Var.b);
            throw new IllegalArgumentException(dw1.s(sb, d98Var.b == cls ? "" : bl4.t(cls, " (native type ", ")"), ", which is not supported within a Structure"), e);
        }
    }

    public static <T extends f98> T newInstance(Class<T> cls) throws IllegalArgumentException {
        return (T) yq2.r0(cls);
    }
}
