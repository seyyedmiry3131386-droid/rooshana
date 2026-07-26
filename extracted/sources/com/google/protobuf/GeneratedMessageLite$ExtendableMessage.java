package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import defpackage.bb2;
import defpackage.d72;
import defpackage.dv4;
import defpackage.ev4;
import defpackage.fv4;
import defpackage.h72;
import defpackage.hr2;
import defpackage.ir2;
import defpackage.lu0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends o implements fv4 {
    protected bb2 extensions = bb2.c;

    private void eagerlyMergeMessageSetExtension(lu0 lu0Var, ir2 ir2Var, h72 h72Var, int i) throws IOException {
        parseExtension(lu0Var, h72Var, ir2Var, (i << 3) | 2, i);
    }

    private void mergeMessageSetExtensionFromBytes(ByteString byteString, h72 h72Var, ir2 ir2Var) throws IOException {
        ev4 ev4Var = (ev4) this.extensions.a.get(ir2Var.d);
        dv4 builder = ev4Var != null ? ev4Var.toBuilder() : null;
        if (builder == null) {
            builder = ir2Var.c.newBuilderForType();
        }
        builder.mergeFrom(byteString, h72Var);
        ensureExtensionsAreMutable().o(ir2Var.d, ir2Var.b(builder.build()));
    }

    private <MessageType extends ev4> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, lu0 lu0Var, h72 h72Var) throws IOException {
        int iG = 0;
        ByteString byteStringN = null;
        ir2 ir2VarA = null;
        while (true) {
            int iF = lu0Var.F();
            if (iF == 0) {
                break;
            }
            if (iF == 16) {
                iG = lu0Var.G();
                if (iG != 0) {
                    ir2VarA = h72Var.a(iG, messagetype);
                }
            } else if (iF == 26) {
                if (iG == 0 || ir2VarA == null) {
                    byteStringN = lu0Var.n();
                } else {
                    eagerlyMergeMessageSetExtension(lu0Var, ir2VarA, h72Var, iG);
                    byteStringN = null;
                }
            } else if (!lu0Var.I(iF)) {
                break;
            }
        }
        lu0Var.a(12);
        if (byteStringN == null || iG == 0) {
            return;
        }
        if (ir2VarA != null) {
            mergeMessageSetExtensionFromBytes(byteStringN, h72Var, ir2VarA);
        } else {
            mergeLengthDelimitedField(iG, byteStringN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean parseExtension(defpackage.lu0 r6, defpackage.h72 r7, defpackage.ir2 r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite$ExtendableMessage.parseExtension(lu0, h72, ir2, int, int):boolean");
    }

    private void verifyExtensionContainingType(ir2 ir2Var) {
        if (ir2Var.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public bb2 ensureExtensionsAreMutable() {
        bb2 bb2Var = this.extensions;
        if (bb2Var.b) {
            this.extensions = bb2Var.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.i();
    }

    public int extensionsSerializedSize() {
        return this.extensions.h();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.f();
    }

    @Override // com.google.protobuf.o, defpackage.fv4
    public /* bridge */ /* synthetic */ ev4 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(d72 d72Var) {
        ir2 ir2VarAccess$000 = o.access$000(d72Var);
        verifyExtensionContainingType(ir2VarAccess$000);
        bb2 bb2Var = this.extensions;
        Type type = (Type) bb2Var.a.get(ir2VarAccess$000.d);
        if (type == null) {
            return (Type) ir2VarAccess$000.b;
        }
        hr2 hr2Var = ir2VarAccess$000.d;
        if (!hr2Var.c) {
            return (Type) ir2VarAccess$000.a(type);
        }
        if (hr2Var.b.a != WireFormat$JavaType.ENUM) {
            return type;
        }
        ?? r1 = (Type) new ArrayList();
        Iterator it = ((List) type).iterator();
        while (it.hasNext()) {
            r1.add(ir2VarAccess$000.a(it.next()));
        }
        return r1;
    }

    public final <Type> int getExtensionCount(d72 d72Var) {
        ir2 ir2VarAccess$000 = o.access$000(d72Var);
        verifyExtensionContainingType(ir2VarAccess$000);
        bb2 bb2Var = this.extensions;
        hr2 hr2Var = ir2VarAccess$000.d;
        bb2Var.getClass();
        if (!hr2Var.c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = bb2Var.a.get(hr2Var);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public final <Type> boolean hasExtension(d72 d72Var) {
        ir2 ir2VarAccess$000 = o.access$000(d72Var);
        verifyExtensionContainingType(ir2VarAccess$000);
        bb2 bb2Var = this.extensions;
        hr2 hr2Var = ir2VarAccess$000.d;
        bb2Var.getClass();
        if (hr2Var.c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return bb2Var.a.get(hr2Var) != null;
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        bb2 bb2Var = this.extensions;
        if (bb2Var.b) {
            this.extensions = bb2Var.clone();
        }
        this.extensions.m(messagetype.extensions);
    }

    @Override // com.google.protobuf.o, defpackage.ev4
    public /* bridge */ /* synthetic */ dv4 newBuilderForType() {
        return newBuilderForType();
    }

    public n newExtensionWriter() {
        return new n(this);
    }

    public n newMessageSetExtensionWriter() {
        return new n(this);
    }

    public <MessageType extends ev4> boolean parseUnknownField(MessageType messagetype, lu0 lu0Var, h72 h72Var, int i) throws IOException {
        int i2 = i >>> 3;
        return parseExtension(lu0Var, h72Var, h72Var.a(i2, messagetype), i, i2);
    }

    public <MessageType extends ev4> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, lu0 lu0Var, h72 h72Var, int i) throws IOException {
        if (i != 11) {
            return (i & 7) == 2 ? parseUnknownField(messagetype, lu0Var, h72Var, i) : lu0Var.I(i);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, lu0Var, h72Var);
        return true;
    }

    @Override // com.google.protobuf.o, defpackage.ev4
    public /* bridge */ /* synthetic */ dv4 toBuilder() {
        return toBuilder();
    }

    public final <Type> Type getExtension(d72 d72Var, int i) {
        ir2 ir2VarAccess$000 = o.access$000(d72Var);
        verifyExtensionContainingType(ir2VarAccess$000);
        bb2 bb2Var = this.extensions;
        hr2 hr2Var = ir2VarAccess$000.d;
        bb2Var.getClass();
        if (hr2Var.c) {
            Object obj = bb2Var.a.get(hr2Var);
            if (obj != null) {
                return (Type) ir2VarAccess$000.a(((List) obj).get(i));
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
