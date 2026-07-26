package com.google.protobuf;

import defpackage.ar1;
import defpackage.be0;
import defpackage.d72;
import defpackage.de2;
import defpackage.ee4;
import defpackage.ev4;
import defpackage.gf7;
import defpackage.gn6;
import defpackage.h72;
import defpackage.hq3;
import defpackage.hr2;
import defpackage.hv6;
import defpackage.in6;
import defpackage.ir2;
import defpackage.j1;
import defpackage.j26;
import defpackage.jr3;
import defpackage.kr3;
import defpackage.lu0;
import defpackage.nr3;
import defpackage.nv;
import defpackage.or3;
import defpackage.pr3;
import defpackage.qm5;
import defpackage.qr3;
import defpackage.rm7;
import defpackage.rr3;
import defpackage.uy8;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, o> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected w unknownFields;

    public o() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = w.f;
    }

    public static ir2 access$000(d72 d72Var) {
        d72Var.getClass();
        return (ir2) d72Var;
    }

    public static void b(o oVar) throws InvalidProtocolBufferException {
        if (oVar == null || oVar.isInitialized()) {
            return;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = oVar.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    public static o c(o oVar, InputStream inputStream, h72 h72Var) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            lu0 lu0VarH = lu0.h(new j1(lu0.y(i, inputStream), inputStream));
            o partialFrom = parsePartialFrom(oVar, lu0VarH, h72Var);
            lu0VarH.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage(), e2);
        }
    }

    public static o d(o oVar, byte[] bArr, int i, int i2, h72 h72Var) throws InvalidProtocolBufferException {
        o oVarNewMutableInstance = oVar.newMutableInstance();
        try {
            gn6 gn6Var = gn6.c;
            gn6Var.getClass();
            gf7 gf7VarA = gn6Var.a(oVarNewMutableInstance.getClass());
            gf7VarA.j(oVarNewMutableInstance, bArr, i, i + i2, new nv(h72Var));
            gf7VarA.b(oVarNewMutableInstance);
            return oVarNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public static jr3 emptyBooleanList() {
        return be0.d;
    }

    public static kr3 emptyDoubleList() {
        return ar1.d;
    }

    public static or3 emptyFloatList() {
        return de2.d;
    }

    public static pr3 emptyIntList() {
        return hq3.d;
    }

    public static qr3 emptyLongList() {
        return ee4.d;
    }

    public static <E> rr3 emptyProtobufList() {
        return in6.d;
    }

    public static <T extends o> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((o) uy8.b(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static pr3 mutableCopy(pr3 pr3Var) {
        hq3 hq3Var = (hq3) pr3Var;
        int i = hq3Var.c;
        int i2 = i == 0 ? 10 : i * 2;
        if (i2 >= i) {
            return new hq3(Arrays.copyOf(hq3Var.b, i2), hq3Var.c, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(ev4 ev4Var, String str, Object[] objArr) {
        return new hv6(ev4Var, str, objArr);
    }

    public static <ContainingType extends ev4, Type> ir2 newRepeatedGeneratedExtension(ContainingType containingtype, ev4 ev4Var, nr3 nr3Var, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new ir2(containingtype, Collections.EMPTY_LIST, ev4Var, new hr2(nr3Var, i, wireFormat$FieldType, true, z));
    }

    public static <ContainingType extends ev4, Type> ir2 newSingularGeneratedExtension(ContainingType containingtype, Type type, ev4 ev4Var, nr3 nr3Var, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new ir2(containingtype, type, ev4Var, new hr2(nr3Var, i, wireFormat$FieldType, false, false));
    }

    public static <T extends o> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) c(t, inputStream, h72.b());
        b(t2);
        return t2;
    }

    public static <T extends o> T parseFrom(T t, ByteBuffer byteBuffer, h72 h72Var) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, lu0.i(byteBuffer, false), h72Var);
        b(t2);
        return t2;
    }

    public static <T extends o> T parsePartialFrom(T t, lu0 lu0Var, h72 h72Var) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            gn6 gn6Var = gn6.c;
            gn6Var.getClass();
            gf7 gf7VarA = gn6Var.a(t2.getClass());
            g gVar = lu0Var.b;
            if (gVar == null) {
                gVar = new g(lu0Var);
            }
            gf7VarA.e(t2, gVar, h72Var);
            gf7VarA.b(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends o> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(GeneratedMessageLite$MethodToInvoke.c);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        return gn6Var.a(getClass()).g(this);
    }

    public final <MessageType extends o, BuilderType extends m> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(GeneratedMessageLite$MethodToInvoke.e);
    }

    public Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj) {
        return dynamicMethod(generatedMessageLite$MethodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        return gn6Var.a(getClass()).i(this, (o) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final j26 getParserForType() {
        return (j26) dynamicMethod(GeneratedMessageLite$MethodToInvoke.g);
    }

    @Override // com.google.protobuf.a
    public int getSerializedSize(gf7 gf7Var) {
        int iH;
        int iH2;
        if (isMutable()) {
            if (gf7Var == null) {
                gn6 gn6Var = gn6.c;
                gn6Var.getClass();
                iH2 = gn6Var.a(getClass()).h(this);
            } else {
                iH2 = gf7Var.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(rm7.n(iH2, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (gf7Var == null) {
            gn6 gn6Var2 = gn6.c;
            gn6Var2.getClass();
            iH = gn6Var2.a(getClass()).h(this);
        } else {
            iH = gf7Var.h(this);
        }
        setMemoizedSerializedSize(iH);
        return iH;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.fv4
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        gn6Var.a(getClass()).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        if (this.unknownFields == w.f) {
            this.unknownFields = new w();
        }
        w wVar = this.unknownFields;
        wVar.a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        wVar.f((i << 3) | 2, byteString);
    }

    public final void mergeUnknownFields(w wVar) {
        this.unknownFields = w.e(this.unknownFields, wVar);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.unknownFields == w.f) {
            this.unknownFields = new w();
        }
        w wVar = this.unknownFields;
        wVar.a();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        wVar.f(i << 3, Long.valueOf(i2));
    }

    public o newMutableInstance() {
        return (o) dynamicMethod(GeneratedMessageLite$MethodToInvoke.d);
    }

    public boolean parseUnknownField(int i, lu0 lu0Var) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.unknownFields == w.f) {
            this.unknownFields = new w();
        }
        return this.unknownFields.d(i, lu0Var);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(rm7.n(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = p.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        p.c(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.ev4
    public void writeTo(j jVar) throws IOException {
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        gf7 gf7VarA = gn6Var.a(getClass());
        qm5 qm5Var = jVar.i;
        if (qm5Var == null) {
            qm5Var = new qm5(jVar);
        }
        gf7VarA.f(this, qm5Var);
    }

    public static final <T extends o> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(GeneratedMessageLite$MethodToInvoke.a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        boolean zC = gn6Var.a(t.getClass()).c(t);
        if (z) {
            t.dynamicMethod(GeneratedMessageLite$MethodToInvoke.b, zC ? t : null);
        }
        return zC;
    }

    public final <MessageType extends o, BuilderType extends m> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((o) messagetype);
    }

    public Object dynamicMethod(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        return dynamicMethod(generatedMessageLite$MethodToInvoke, null, null);
    }

    @Override // defpackage.fv4
    public final o getDefaultInstanceForType() {
        return (o) dynamicMethod(GeneratedMessageLite$MethodToInvoke.f);
    }

    @Override // defpackage.ev4
    public final m newBuilderForType() {
        return (m) dynamicMethod(GeneratedMessageLite$MethodToInvoke.e);
    }

    @Override // defpackage.ev4
    public final m toBuilder() {
        return ((m) dynamicMethod(GeneratedMessageLite$MethodToInvoke.e)).mergeFrom(this);
    }

    public static <T extends o> T parseDelimitedFrom(T t, InputStream inputStream, h72 h72Var) throws InvalidProtocolBufferException {
        T t2 = (T) c(t, inputStream, h72Var);
        b(t2);
        return t2;
    }

    public static <T extends o> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, h72.b());
    }

    public static qr3 mutableCopy(qr3 qr3Var) {
        ee4 ee4Var = (ee4) qr3Var;
        int i = ee4Var.c;
        int i2 = i == 0 ? 10 : i * 2;
        if (i2 >= i) {
            return new ee4(Arrays.copyOf(ee4Var.b, i2), ee4Var.c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends o> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, byteString, h72.b());
        b(t2);
        return t2;
    }

    public static <T extends o> T parseFrom(T t, ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        lu0 lu0VarP = byteString.p();
        T t2 = (T) parsePartialFrom(t, lu0VarP, h72Var);
        lu0VarP.a(0);
        b(t2);
        return t2;
    }

    public static or3 mutableCopy(or3 or3Var) {
        de2 de2Var = (de2) or3Var;
        int i = de2Var.c;
        int i2 = i == 0 ? 10 : i * 2;
        if (i2 >= i) {
            return new de2(Arrays.copyOf(de2Var.b, i2), de2Var.c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends o> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) d(t, bArr, 0, bArr.length, h72.b());
        b(t2);
        return t2;
    }

    public static kr3 mutableCopy(kr3 kr3Var) {
        ar1 ar1Var = (ar1) kr3Var;
        int i = ar1Var.c;
        int i2 = i == 0 ? 10 : i * 2;
        if (i2 >= i) {
            return new ar1(Arrays.copyOf(ar1Var.b, i2), ar1Var.c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends o> T parseFrom(T t, byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        T t2 = (T) d(t, bArr, 0, bArr.length, h72Var);
        b(t2);
        return t2;
    }

    public static jr3 mutableCopy(jr3 jr3Var) {
        be0 be0Var = (be0) jr3Var;
        int i = be0Var.c;
        int i2 = i == 0 ? 10 : i * 2;
        if (i2 >= i) {
            return new be0(Arrays.copyOf(be0Var.b, i2), be0Var.c, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends o> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, lu0.h(inputStream), h72.b());
        b(t2);
        return t2;
    }

    public static <E> rr3 mutableCopy(rr3 rr3Var) {
        int size = rr3Var.size();
        return rr3Var.g(size == 0 ? 10 : size * 2);
    }

    public static <T extends o> T parseFrom(T t, InputStream inputStream, h72 h72Var) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, lu0.h(inputStream), h72Var);
        b(t2);
        return t2;
    }

    @Override // defpackage.ev4
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends o> T parseFrom(T t, lu0 lu0Var) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, lu0Var, h72.b());
    }

    public static <T extends o> T parseFrom(T t, lu0 lu0Var, h72 h72Var) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, lu0Var, h72Var);
        b(t2);
        return t2;
    }

    public static <T extends o> T parsePartialFrom(T t, lu0 lu0Var) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, lu0Var, h72.b());
    }
}
