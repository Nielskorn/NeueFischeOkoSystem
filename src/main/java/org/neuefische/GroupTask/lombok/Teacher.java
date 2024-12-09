package org.neuefische.GroupTask.lombok;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Teacher(int id, String Name,String Subject) {
}
