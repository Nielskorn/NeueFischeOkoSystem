package org.neuefische.GroupTask.lombok;

import java.util.List;

public record University(int id, String name, List<Course>courses) {
}
