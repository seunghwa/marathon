package mesosphere.marathon

import ch.qos.logback.classic.pattern.ClassicConverter
import ch.qos.logback.classic.spi.ILoggingEvent
import java.lang.management.ManagementFactory

class ProcessIdConverter extends ClassicConverter {
  private final val processId =
    ManagementFactory.getRuntimeMXBean().getName().split('@').head

  override def convert(event: ILoggingEvent): String =
    return processId;
}
