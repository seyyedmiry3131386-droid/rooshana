package io.sentry.protocol;

import io.sentry.g2;
import io.sentry.i3;
import io.sentry.u0;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugImage implements g2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.g2
    public void serialize(i3 i3Var, u0 u0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) i3Var;
        cVar.d();
        if (this.uuid != null) {
            cVar.q("uuid");
            cVar.z(this.uuid);
        }
        if (this.type != null) {
            cVar.q("type");
            cVar.z(this.type);
        }
        if (this.debugId != null) {
            cVar.q("debug_id");
            cVar.z(this.debugId);
        }
        if (this.debugFile != null) {
            cVar.q("debug_file");
            cVar.z(this.debugFile);
        }
        if (this.codeId != null) {
            cVar.q("code_id");
            cVar.z(this.codeId);
        }
        if (this.codeFile != null) {
            cVar.q("code_file");
            cVar.z(this.codeFile);
        }
        if (this.imageAddr != null) {
            cVar.q("image_addr");
            cVar.z(this.imageAddr);
        }
        if (this.imageSize != null) {
            cVar.q("image_size");
            cVar.y(this.imageSize);
        }
        if (this.arch != null) {
            cVar.q("arch");
            cVar.z(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                cVar.q(str);
                cVar.w(u0Var, obj);
            }
        }
        cVar.n();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
