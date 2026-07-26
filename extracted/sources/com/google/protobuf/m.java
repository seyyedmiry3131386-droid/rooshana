package com.google.protobuf;

import defpackage.gf7;
import defpackage.gn6;
import defpackage.h72;
import defpackage.k1;
import defpackage.lu0;
import defpackage.nv;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends k1 {
    private final o defaultInstance;
    protected o instance;

    public m(o oVar) {
        this.defaultInstance = oVar;
        if (oVar.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = oVar.newMutableInstance();
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    public void copyOnWriteInternal() {
        o oVarNewMutableInstance = this.defaultInstance.newMutableInstance();
        o oVar = this.instance;
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        gn6Var.a(oVarNewMutableInstance.getClass()).a(oVarNewMutableInstance, oVar);
        this.instance = oVarNewMutableInstance;
    }

    @Override // defpackage.fv4
    public final boolean isInitialized() {
        return o.isInitialized(this.instance, false);
    }

    @Override // defpackage.dv4
    public final o build() {
        o oVarBuildPartial = buildPartial();
        if (oVarBuildPartial.isInitialized()) {
            return oVarBuildPartial;
        }
        throw k1.newUninitializedMessageException(oVarBuildPartial);
    }

    @Override // defpackage.dv4
    public o buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public final m m10clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = this.defaultInstance.newMutableInstance();
        return this;
    }

    @Override // defpackage.fv4
    public o getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // defpackage.k1
    public m internalMergeFrom(o oVar) {
        return mergeFrom(oVar);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m m13clone() {
        m mVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
        mVarNewBuilderForType.instance = buildPartial();
        return mVarNewBuilderForType;
    }

    public m mergeFrom(o oVar) {
        if (getDefaultInstanceForType().equals(oVar)) {
            return this;
        }
        copyOnWrite();
        o oVar2 = this.instance;
        gn6 gn6Var = gn6.c;
        gn6Var.getClass();
        gn6Var.a(oVar2.getClass()).a(oVar2, oVar);
        return this;
    }

    @Override // defpackage.k1
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public m m15mergeFrom(byte[] bArr, int i, int i2, h72 h72Var) throws InvalidProtocolBufferException {
        copyOnWrite();
        try {
            gn6 gn6Var = gn6.c;
            o oVar = this.instance;
            gn6Var.getClass();
            gn6Var.a(oVar.getClass()).j(this.instance, bArr, i, i + i2, new nv(h72Var));
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.i();
        }
    }

    @Override // defpackage.k1
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public m m14mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return m15mergeFrom(bArr, i, i2, h72.b());
    }

    @Override // defpackage.k1, defpackage.dv4
    public m mergeFrom(lu0 lu0Var, h72 h72Var) throws IOException {
        copyOnWrite();
        try {
            gn6 gn6Var = gn6.c;
            o oVar = this.instance;
            gn6Var.getClass();
            gf7 gf7VarA = gn6Var.a(oVar.getClass());
            o oVar2 = this.instance;
            g gVar = lu0Var.b;
            if (gVar == null) {
                gVar = new g(lu0Var);
            }
            gf7VarA.e(oVar2, gVar, h72Var);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }
}
