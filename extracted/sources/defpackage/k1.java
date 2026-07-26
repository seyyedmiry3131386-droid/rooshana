package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 implements dv4 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public static UninitializedMessageException newUninitializedMessageException(ev4 ev4Var) {
        return new UninitializedMessageException();
    }

    public final String b() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    public abstract k1 internalMergeFrom(a aVar);

    public boolean mergeDelimitedFrom(InputStream inputStream, h72 h72Var) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mergeFrom((InputStream) new j1(lu0.y(i, inputStream), inputStream), h72Var);
        return true;
    }

    @Override // defpackage.dv4
    public abstract k1 mergeFrom(lu0 lu0Var, h72 h72Var);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract k1 m14mergeFrom(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract k1 m15mergeFrom(byte[] bArr, int i, int i2, h72 h72Var);

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = tr3.a;
        iterable.getClass();
        if (iterable instanceof i44) {
            List listK = ((i44) iterable).k();
            i44 i44Var = (i44) list;
            int size = list.size();
            for (Object obj : listK) {
                if (obj == null) {
                    String str = "Element at index " + (i44Var.size() - size) + " is null.";
                    for (int size2 = i44Var.size() - 1; size2 >= size; size2--) {
                        i44Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    i44Var.I((ByteString) obj);
                } else {
                    i44Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zj6) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
        return mergeDelimitedFrom(inputStream, h72.b());
    }

    public k1 mergeFrom(lu0 lu0Var) throws IOException {
        return mergeFrom(lu0Var, h72.b());
    }

    public k1 mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
        try {
            lu0 lu0VarP = byteString.p();
            mergeFrom(lu0VarP);
            lu0VarP.a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(b(), e2);
        }
    }

    @Override // defpackage.dv4
    public k1 mergeFrom(ByteString byteString, h72 h72Var) throws InvalidProtocolBufferException {
        try {
            lu0 lu0VarP = byteString.p();
            mergeFrom(lu0VarP, h72Var);
            lu0VarP.a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(b(), e2);
        }
    }

    @Override // defpackage.dv4
    public k1 mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return m14mergeFrom(bArr, 0, bArr.length);
    }

    public k1 mergeFrom(byte[] bArr, h72 h72Var) throws InvalidProtocolBufferException {
        return m15mergeFrom(bArr, 0, bArr.length, h72Var);
    }

    public k1 mergeFrom(InputStream inputStream) throws IOException {
        lu0 lu0VarH = lu0.h(inputStream);
        mergeFrom(lu0VarH);
        lu0VarH.a(0);
        return this;
    }

    public k1 mergeFrom(InputStream inputStream, h72 h72Var) throws IOException {
        lu0 lu0VarH = lu0.h(inputStream);
        mergeFrom(lu0VarH, h72Var);
        lu0VarH.a(0);
        return this;
    }

    @Override // defpackage.dv4
    public k1 mergeFrom(ev4 ev4Var) {
        if (getDefaultInstanceForType().getClass().isInstance(ev4Var)) {
            return internalMergeFrom((a) ev4Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
