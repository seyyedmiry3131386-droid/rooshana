package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.br9;
import defpackage.js3;
import defpackage.m88;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class VariableEvent extends AnalyticsEvent {
    private final EventType type;
    private final Map<String, Set<String>> variables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VariableEvent(long j, ScreenMetadata screenMetadata, Map<String, ? extends Set<String>> map) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(map, "variables");
        this.variables = map;
        this.type = EventType.Variable;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    public final Map<String, Set<String>> getVariables() {
        return this.variables;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + relativeTimestamp(j) + ',' + getType().getCustomOrdinal());
        for (Map.Entry<String, Set<String>> entry : this.variables.entrySet()) {
            String key = entry.getKey();
            js3.p(key, "string");
            sb.append(",\"" + m88.X(m88.X(m88.X(m88.X(key, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " ") + "\",[");
            List listP0 = a.P0(entry.getValue());
            int size = listP0.size();
            for (int i = 0; i < size; i++) {
                String str = (String) listP0.get(i);
                js3.p(str, "string");
                sb.append("\"" + m88.X(m88.X(m88.X(m88.X(str, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " ") + '\"');
                if (i < br9.y(listP0)) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        sb.append("]");
        String string = sb.toString();
        js3.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
