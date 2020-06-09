package mikufan.cx.vocadbpv_task_producer.config.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import mikufan.cx.common_entity.pv.PvService;
import org.eclipse.collections.api.list.ImmutableList;

import java.io.File;

/**
 * entity class to store user arguments
 * @author CX无敌
 */
@Builder @Getter
public class UserConfig {
  /**
   * the list id, download video from which VocaDB fav list
   */
  private final int listId;

  /**
   * give a name for this task, not a critical field but could be useful for human readability
   */
  @NonNull private final String taskName;

  /**
   * the json file, where to store or update the task,
   */
  @NonNull private final File taskJsonFile;

  /**
   * the json file as well, to store all info about songs in the task.
   * this is useful for other components in the whole Project-VD later
   */
  @NonNull private final File referenceJsonFile;

  /**
   * do you prefer youtube over niconico, or vise area, tell me your preference
   */
  @NonNull private final ImmutableList<PvService> pvPerfOrd;

  /**
   * your own user-agent, includes VocaDB username if you can
   */
  @NonNull private final String userAgent;
}
