package blueeyes.core.service

/**
 * An http service - the fundamental concept in Blue Eyes.
 */
trait HttpService[T] extends RestHierarchyBuilder[T] {
  /** The short name of the service, e.g. "email"
   */
  def name: String
  
  /** The version of the service, e.g. "1.02.09" 
   */
  def version: String
  
  /** The root path of the service, which defaults to "/"
   */
  def rootPath: String = "/"
}