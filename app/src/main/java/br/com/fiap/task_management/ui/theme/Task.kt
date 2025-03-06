package br.com.fiap.task_management.ui.theme

data class Task(
    val id: Int,
    val title: String,
    val status: Status,
)

enum class Status {
    PENDENTE,
    CONCLUIDO,
    CANCELADO
}